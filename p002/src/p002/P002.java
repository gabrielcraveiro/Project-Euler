package p002;

public class P002 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("A soma de todos os numeros de fibonacci abaixo de 4 milhões que são pares");
        long num1 = 1;
        long soma = 0;
        long num2 = 0;
        long fibo = 0;

        for (long i = 0; fibo < 4000000; i++) { //repete até o numero de fibo ser < que 4kk
            fibo = num1 + num2; 
            num1 = num2; 
            num2 = fibo; 
            if (fibo % 2 == 0) {
                soma += fibo;
            }
        }
        System.out.println(soma);
    }

}
