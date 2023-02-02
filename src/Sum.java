public class Sum {

    public static void main(String[] args) {
        int array[] = {3, 6, 4, 7, 2, 1, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % array[i] == 0){
                array[i] *= array[i];
            }
            sum = sum + array[i];

            }
        System.out.println(sum);
        }
    }

