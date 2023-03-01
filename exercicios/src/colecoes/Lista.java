package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List <String> lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("Adalberto");
        lista.add("Luisa");
        lista.add("Amanda");

        System.out.print(lista.remove(1) + "\n\n");

        for (String nome: lista){
            System.out.println(nome);
        }
    }
}
