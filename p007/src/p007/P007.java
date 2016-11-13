package p007;

public class P007 {

    public static void main(String[] args) {
        System.out.println("O ultimo primo até 10001");
        int primeCounter = 0;
        int z = 0;
        for (int i = 1; primeCounter < 10001; i++) {
            if (xD(i)) {
                primeCounter++;
                z = i;
            }
        }

        System.out.println("O ultimo primo é: "+z);
    }

    public static boolean xD(int i) {
        int r = 0;
        if (i % 2 == 0) {
            return false;
        } else {
            for (int j = 1; j < i; j = j + 2) {
                if (i % j == 0) {
                    r++;
                }
            }
            if (r > 1) {
                return false;
            } else {
                return true;
            }
        }
    }

}
