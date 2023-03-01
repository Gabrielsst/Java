package classe;

import java.util.Objects;

public class Usuarios {

    String nome;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(nome, usuarios.nome) && Objects.equals(email, usuarios.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
