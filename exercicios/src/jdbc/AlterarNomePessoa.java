package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código da pessoa: ");
        int codigo = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite o novo nome: ");
        String nome = entrada.nextLine();

        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?;";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, codigo);
        stmt.execute();

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
