package desafios;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.
public class Divisores1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1;i<=n ; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
