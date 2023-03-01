package exercicios;

import java.util.Scanner;

public class ImprimeMaiorValor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int maiorValor = 0;
        int contador = 0;

        do {
            System.out.print("Digite um valor: ");
            maiorValor = Math.max(maiorValor, entrada.
                    nextInt());
            contador++;
        } while(contador < 10);

        System.out.printf("O maior número é %d", maiorValor);

        entrada.close();
    }
}
