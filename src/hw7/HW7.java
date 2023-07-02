package hw7;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {


        int[] array = new int[]{5, 2, 7, 4, 2};
        int n = 10;

        int[] arrayTemp = addElement(array, n);
        System.out.println(Arrays.toString(arrayTemp));


    }
    private static int[] addElement(int[] array, int n) {
        int[] newArray = new int[array.length + n];
        System.arraycopy(array,0,newArray,0,array.length);
        return newArray;
    }
}


