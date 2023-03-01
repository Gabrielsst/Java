package exercicios;

import java.util.Scanner;

public class ResultadosQuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = entrada.nextDouble();

        double quadrado = Math.pow(num1, 2);
        double cubo = Math.pow(num1, 3);

        System.out.printf("O número ao quadrado é %.2f" +
                " e ao cubo é %.2f", quadrado, cubo);

        entrada.close();
    }
}
