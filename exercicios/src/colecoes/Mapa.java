package colecoes;

import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(30, "Leticia");
        usuarios.put(4, "Adriano");
        usuarios.put(5, "Livia");

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
