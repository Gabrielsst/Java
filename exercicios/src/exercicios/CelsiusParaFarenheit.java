package exercicios;

import java.util.Scanner;

public class CelsiusParaFarenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número em Celsius: ");
        double num1 = entrada.nextDouble();
        double fator = 9/5.0;
        double redutor = 32;

        double farenheit = (num1 * fator) + redutor;

        System.out.printf("O número é %.2f°F", farenheit);

        entrada.close();
    }
}
