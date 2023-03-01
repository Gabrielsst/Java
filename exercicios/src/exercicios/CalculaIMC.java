package exercicios;

import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("O valor do IMC é %.2f", imc);

        entrada.close();
    }
}
