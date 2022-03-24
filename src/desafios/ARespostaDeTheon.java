package desafios;

import java.io.IOException;
import java.util.Scanner;

/*
Ramsay: "(...) você vence se conseguir adivinhar quem eu sou e por que estou torturando você."

Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá fazer
depois que Theon der sua resposta.

Theon pode dizer que seu algoz é alguma dentre N pessoas. Considere que as pessoas são numeradas de 1 a N.
Se Theon responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.

Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a minimizar o número de vezes
que ele será atingido.
 */
public class ARespostaDeTheon {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T, menor = 0, pMenor = 0;

        for (int i = 1; i <= N; i++) {
            T = sc.nextInt();

            if ((T < menor) && (N >= 1) && (N <= 100) && (T >= 0) && (T <= 20)) {
                pMenor = i;
                menor = T;
            } else if ((pMenor == 0) && (N >= 1) && (N <= 100) && (T >= 0) && (T <= 20)) {
                pMenor = i;
                menor = T;
            }
        }
        System.out.println(pMenor);
        sc.close();
    }
}

