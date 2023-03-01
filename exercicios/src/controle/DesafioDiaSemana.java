package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String diaDaSemana = entrada.nextLine();

        if ("Domingo".equalsIgnoreCase(diaDaSemana)){
            System.out.println(1);
        }
        else if ("Segunda".equalsIgnoreCase(diaDaSemana)){
            System.out.println(2);
        }
        else if ("Terça".equalsIgnoreCase(diaDaSemana)
        || "Terca".equalsIgnoreCase(diaDaSemana)){
            System.out.println(3);
        }
        else if ("Quarta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(4);
        }
        else if ("Quinta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(5);
        }
        else if("Sexta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(6);
        }
        else if ("Sábado".equalsIgnoreCase(diaDaSemana)
        || "Sabado".equalsIgnoreCase(diaDaSemana)){
            System.out.println(7);
        }
        else {
            System.out.println("Dia da semana inválido!");
        }

        entrada.close();
    }
}
