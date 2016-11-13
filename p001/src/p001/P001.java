package p001;

public class P001 {

    public static void main(String[] args) {
        // Multiplos de 3 e 5
        int x = 3;
        int y = 5;
        int sum = 0;
        System.out.println("Multiplos de 3 e 5: ");
        for (int i = 0; i < 1000; i++) { //Repita o i até 1000
            if (i % x == 0) { //Se o i for divisivel por 3 aumente a soma
                sum += i;
            } else if (i % y == 0) { //se o i for divisivel por 5 aumente a soma
                sum += i;
            }
        }
        System.out.println("A soma é igual a: " + sum);
    }

}
