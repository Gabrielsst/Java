package exercicios;

import java.util.Scanner;

public class FarenheitParaCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número em Farenheit: ");
        double num1 = entrada.nextDouble();
        double fator = 5/9.0;
        double redutor = 32;

        double celsius = (num1 - redutor) * fator;

        System.out.printf("O número é %.2f°C", celsius);

        entrada.close();
    }
}
