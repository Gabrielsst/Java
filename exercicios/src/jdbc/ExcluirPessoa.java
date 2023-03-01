package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE nome = ?";

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
