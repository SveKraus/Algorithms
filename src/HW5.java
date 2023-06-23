
public class HW5 {
    public static void main(String[] args) {
        boolean[] vers = {true, true, false, false, false, false, false};


        System.out.println(contains(vers));

    }

    public static int contains(boolean[] vers) {

        for (int i = 0; i < vers.length; i++) {

            if (vers[i] == false){
                return i;
            }


        }
        return -1;

    }
}

