package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        boolean trabalhouTerca = false;
        boolean trabalhouQuinta = false;

        System.out.println("Comprou TV de 50\"? "
                + (trabalhouTerca && trabalhouQuinta));

        System.out.println("Comprou TV de 32\"? "
                + (trabalhouTerca ^ trabalhouQuinta));

        /* ALT + J seleciona os itens semelhantes
           e permite editá-los em conjunto */

        /* ALT + SHIFT + INSERT ativa o modo coluna da IDE
           depois basta apertar SHIFT + seta.
         */

        System.out.println("Comprou Sorvete? "
                + (trabalhouTerca || trabalhouQuinta));

        System.out.println("Ficou mais saudável? "
                + (!(trabalhouTerca || trabalhouQuinta)));
    }
}
