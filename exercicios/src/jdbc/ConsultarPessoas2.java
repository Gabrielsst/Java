package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite para pesquisar: ");
        String texto = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + texto + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            pessoas.add(new Pessoa(resultado.getInt("codigo"),
                    resultado.getString("nome")));
        }

        pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getCodigo() + " ==> " +
                pessoa.getNome()));

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
