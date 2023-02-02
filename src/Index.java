import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        int num = 4;
        int index = -1;
        int[] arr = {3, 6, 4, 7, 2, 1, 9};

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == num){
                index = i;

            }

        }
        System.out.println(index);
    }
}