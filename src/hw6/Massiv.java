package hw6;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(run(nums)));
    }

    public static int[] run(int[] num) {
        for (int i = 1; i < num.length; i++) {
            num[i] = num[i] + num[i - 1];


        }
        return num;

    }
}
