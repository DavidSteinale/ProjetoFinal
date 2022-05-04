package projetofinal;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Atualizar {

    Conexao conn = new Conexao();

    public void analista(String nome, int id) {
//        String sql = "UPDATE analista SET nome_analista = ' " + nome + "'WHERE ID_ANALISTA='"+ id + "'";
//        String sql = "UPDATE analista SET nome_analista = ' " + nome + "'WHERE ID_ANALISTA=?";

        try {
            PreparedStatement alterar = conn.getConexao().prepareStatement("UPDATE analista SET nome_analista = ? WHERE ID_ANALISTA=?");
            alterar.setString(1, nome);
            alterar.setInt(2, id);
            alterar.executeUpdate();
            System.out.println("Atualizado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
}
