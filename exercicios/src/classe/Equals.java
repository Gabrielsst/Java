package classe;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {

        Usuarios u1 = new Usuarios();
        u1.nome = "Leandro Augusto";
        u1.email = "leandro.augusto@rhemail.com.br";

        Usuarios u2 = new Usuarios();
        u2.nome = "Leandro Augusto";
        u2.email = "leandro.augusto@rhemail.com.br";

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
