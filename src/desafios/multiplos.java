package desafios;

//Desafio
//Pink e Cérebro dividem um apartamento e estão juntos 24h por dia desde o começo da pandemia. Para passar o tempo
//Pink cria problemas matemáticos para Cérebro resolver, o último deles foi uma lista de números com a seguinte pergunta:
// quantos números da lista são múltiplos de 2, 3, 4 e 5?



import java.util.Scanner;

public class multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int multiplosDe2 = 0, multiplosDe3 = 0, multiplosDe4 = 0, multiplosDe5 = 0;

        for (int i = 0; i < n; i++) {
            int entrada = sc.nextInt();
            if (entrada % 2 == 0) {
                multiplosDe2++;
            }
            if (entrada % 3 == 0) {
                multiplosDe3++;
            }
            if (entrada %4 == 0){
                multiplosDe4++;
            }
            if(entrada %5 ==0){
                multiplosDe5++;
            }
            //TODO: Complete a solução criando as condições e incrementos para os múltiplos de 4 e 5.
        }

        System.out.printf("%d Multiplo(s) de 2\n", multiplosDe2);
        System.out.printf("%d Multiplo(s) de 3\n", multiplosDe3);
        System.out.printf("%d Multiplo(s) de 4\n", multiplosDe4);
        System.out.printf("%d Multiplo(s) de 5\n", multiplosDe5);

    }
}