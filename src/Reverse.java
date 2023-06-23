import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String[] word = new String[]{"п", "р", "и", "в", "е", "т"};
        System.out.println(Arrays.toString(reverseString(word)));
    }

    public static String[] reverseString(String[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return s;
    }
}

