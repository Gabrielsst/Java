package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String continuar = "Sim";
        int numeroSorteado = 0;
        int numero = 0;

        do {
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);
            int contador = 0;

            System.out.println("Que os jogos comecem!");
            for (int i = 10; i > 0; i--){
                System.out.printf("Jogador possui %d tentativas" +
                        " restantes.", i);

                System.out.print("\nDigite um número: ");
                numero = entrada.nextInt();

                if (numero == numeroSorteado){
                    System.out.print("Parabêns!! Você" +
                            " acertou.");
                    contador++;
                    break;
                }
                else if (numero > numeroSorteado){
                    System.out.println("Número " +
                            " maior que o Sorteado.");
                }
                else{
                    System.out.println("Número menor que" +
                            " o Sorteado.");
                }
            }

            if (contador == 0){
                System.out.printf("Você não acertou, " +
                        "o número era %d.", numeroSorteado);
            }

            System.out.print("\nQuer continuar jogando? ");
            continuar = entrada.next();
        } while (!(continuar.equalsIgnoreCase("Não")
                || continuar.equalsIgnoreCase("Nao")));

        entrada.close();
    }
}
