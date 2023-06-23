import java.util.Arrays;

import static java.awt.geom.Path2D.contains;

public class HW5 {
    public static int main(String[] args) {
        boolean[] vers = {true, true, false, false, false, false, false};
        boolean toFind = false;

        System.out.println(contains(vers, false));
        return 0;
    }

    public static boolean contains(boolean[] vers, boolean b) {
        boolean a = Arrays.binarySearch(boolean[](vers), b));
        int l = 0;
        int r = vers.length - 1;

          for (int i = 0; i < vers.length; i++)

        if (i == false &&  i+1 == true ){
            return i;

        }else if (r == true ){
            return -1;
        }

    }
}

