package exercicios;

import java.util.Scanner;

public class ImprimirSoma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int numero = 0;

        do {
            soma += numero;
            System.out.printf("A soma dos valores é %d",
                    soma);
            System.out.print("\nDigite um valor: ");
            numero = entrada.nextInt();
        } while (numero >= 0);

        System.out.print("Fim do programa!");
        entrada.close();
    }
}
