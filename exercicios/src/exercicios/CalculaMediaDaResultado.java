package exercicios;

import java.util.Scanner;

public class CalculaMediaDaResultado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Insira a nota: ");
            soma += entrada.nextDouble();
        }

        double media = soma / 2;

        if (media >= 7){
            System.out.println("Aprovado!");
        }
        else if (media < 7 && media > 4){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
