import java.util.Arrays;

public class HW5_1 {
    public static void main(String[] args) {
        int[] arrayFirst = new int[]{100, 112, 256, 349, 770};
        int[] arraySecond = new int[]{72, 86, 113, 119, 265, 445, 892};
        System.out.println(Arrays.toString(mergeSortedArrays(arrayFirst, arraySecond)));
    }

        public static int[] mergeSortedArrays( int[] arr1, int[] arr2){
            int m1 = arr1.length;
            int m2 = arr2.length;
            int[] merger = new int[m1 + m2];
            int i = 0, j = 0, n = 0;

            while (i < m1 && j < m2) {
                if (arr1[i] <= arr2[j]) {
                    merger[n++] = arr1[i++];
                } else {
                    merger[n++] = arr2[j++];
                }
            }

            while (i < m1) {
                merger[n++] = arr1[i++];
            }

            while (j < m2) {
                merger[n++] = arr2[j++];
            }
            return merger;
        }
    }