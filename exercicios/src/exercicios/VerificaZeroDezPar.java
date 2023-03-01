package exercicios;

import java.util.Scanner;

public class VerificaZeroDezPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double numero = entrada.nextDouble();

        if (numero >= 0 && numero <= 10 && numero % 2 == 0){
            System.out.println("O número "+ numero + " está " +
                    "entre 0 e 10, e é par!");
        }
        else {
            System.out.println("Não está entre 0 e 10 ou " +
                    "não é par!");
        }
    }
}
