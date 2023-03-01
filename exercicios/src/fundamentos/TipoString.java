package fundamentos;

import java.util.Locale;

public class TipoString {

    public static void main(String[] args) {
        // CTRL + / coloca uma linha de comentário
        // CTRL + SHIFT + / coloca um bloco de comentário
        // sout + tab geral um system out
        System.out.println("Hello World!");
        // CTRL + SHIFT + seta move a linha de código
        // CTRL + D copia a linha de código

        String s = "Boa tarde";

        System.out.println(s.toLowerCase().startsWith("boa"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
