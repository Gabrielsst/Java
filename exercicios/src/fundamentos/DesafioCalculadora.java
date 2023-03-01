package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String op = entrada.next();

        double resultado = op.equals("+") ? num1 + num2
                : op.equals("-") ? num1 - num2
                : op.equals("*") ? num1 * num2
                : op.equals("/") ? num1 / num2
                : op.equals("%") ? num1 % num2
                : 0;

        System.out.printf("%.2f %s %.2f = %.2f", num1,
                op, num2, resultado);

        entrada.close();
    }
}
