package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.
                printf("Digite o primeiro salário: ");
        double salario1 = Double.parseDouble(entrada.
                nextLine().
                replaceAll(",","."));
System.out.
                printf("Digite o segundo salário: ");
        double salario2 = Double.parseDouble(entrada.
                nextLine().
                replaceAll(",","."));
System.out.
                printf("Digite o terceiro salário: ");
        double salario3 = Double.parseDouble(entrada.
                nextLine().
                replaceAll(",","."));

        double media = (salario1 +
                salario2 + salario3)/3;
        System.out.println("A média dos salários é " +
                media);
        entrada.close();
    }
}
