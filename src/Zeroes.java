import java.util.Arrays;

public class Zeroes {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 3, 12};
        zeroes(array);
        System.out.println(Arrays.toString(array));
    }

    public static void zeroes(int[] num) {
        int left = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {

                num[left] = num[i];
                left++;

            }
        }
        for (int i = left; i < num.length; i++) {
            num[i] = 0;
        }
    }

}

