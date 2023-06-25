package hw6;

public class Chislo {
    public static void main(String[] args) {
        int n = 7;
        int find = num(n);
        System.out.println(find);
    }

    public static int num(int n){
        int i = n;
        while(i%2 != 0 || i%n != 0){
            i = i + n;
        }
        return i;
    }

}
