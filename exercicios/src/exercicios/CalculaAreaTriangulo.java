package exercicios;

import java.util.Scanner;

public class CalculaAreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = entrada.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2f",
                area);

        entrada.close();
    }
}
