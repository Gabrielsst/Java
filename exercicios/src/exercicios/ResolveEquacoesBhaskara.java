package exercicios;

import java.util.Scanner;

public class ResolveEquacoesBhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = entrada.nextDouble();

        double delta = Math.sqrt(Math.pow(b, 2)
                - (4 * a * c));
        double raiz1 = ((-1 * b) + delta) / 2;
        double raiz2 = ((-1 * b) - delta) / 2;

        System.out.printf("O valor de delta é %.2f",
                delta);
        
        System.out.printf("A raiz x\' é %.2f e a " +
                "raiz x\" é %.2f", raiz1, raiz2);

        entrada.close();
    }
}
