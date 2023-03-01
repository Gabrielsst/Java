package exercicios;

import java.util.Scanner;

public class ImprimeLetra {
    public static void main(String[] args) {

        System.out.print("Digite uma palavra: ");
        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.next();

        for (int i = 0; i < palavra.length(); i++){
            System.out.print(palavra.charAt(i) + " ");
        }

        entrada.close();
    }
}
