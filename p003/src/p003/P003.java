package p003;

public class P003 {

    public static void main(String[] args) {
        long num = 600851475143L;
        long pFactor = 1L;

        for (long i = 3L; i <= num / i; ) {
            if (num % i == 0) {
                pFactor = i;
                num = num / i;
            } else {
                i += 2;
            }
        }
        if (pFactor < num) {
            pFactor = num;
        }

        System.out.println(pFactor);
    }
}




