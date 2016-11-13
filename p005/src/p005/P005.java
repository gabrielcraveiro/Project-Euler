package p005;

public class P005 {

    public static void main(String[] args) {
        boolean t = false;
        int n = 2500;
        while (!t) {
            n++;
            if (n % 20 == 0 && n % 19 == 0 && n % 18 == 0 && n % 17 == 0 && n % 16 == 0 && n % 15 == 0 && n % 14 == 0 && n % 13 == 0 && n % 12 == 0 && n % 11 == 0) {
                t = true;
            }
        }
        System.out.println(n);
    }
}
