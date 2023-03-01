package exercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        int qtdVezes = 0;

        for(int i = 2; i < numero; i++){
            if (numero % i == 0) {
                System.out.println("Número " + numero + " não é primo.");
                qtdVezes++;
                break;
            }
        }

        if (qtdVezes == 0){
            System.out.println("Número " + numero + " é primo.");
        }

        entrada.close();
    }
}
