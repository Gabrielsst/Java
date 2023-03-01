package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Bom ");
        System.out.print("dia! \n\n");

        System.out.println("Bom ");
        System.out.println("dia!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        /* lembrar de colocar "entrada.nextLine();"
           depois do nextInt ou nextDouble. */

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close();
    }
}
