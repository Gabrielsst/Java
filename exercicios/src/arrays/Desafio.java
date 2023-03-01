package arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        double[] notas = new double[entrada.nextInt()];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Insira a %dª nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        for (double nota: notas) {
            soma += nota;
        }

        System.out.printf("A média é %.2f",
                soma / notas.length);

        entrada.close();
    }
}
