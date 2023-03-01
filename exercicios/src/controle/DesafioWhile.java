package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double soma = 0;

        int contador = 0;

        do{
            System.out.print("Digite uma nota: ");
            nota = entrada.nextDouble();
            if(nota >= 0 && nota <= 10){
                soma += nota;
                contador++;
            }
            else if (nota != -1){
                System.out.println("Insira uma nota " +
                        "válida!");
            }
        } while (nota != -1);

        if(contador != 0){
            double media = soma / contador;
            System.out.printf("A média é: %.2f", media);
        }
        else{
            System.out.printf("A média é: 0,00");
        }

        entrada.close();
    }
}
