package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Romeo"));
        usuarios.add(new Usuario("Ricky"));
        usuarios.add(new Usuario("Andre"));

        System.out.println(usuarios.contains(new Usuario("Ana")));
    }
}
