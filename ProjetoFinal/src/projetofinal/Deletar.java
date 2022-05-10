package projetofinal;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Deletar {

    Conexao conn = new Conexao();

    public void analista(int codigo_analista) {
        String sql = "DELETE FROM analista WHERE id_analista = (' " + codigo_analista + "')";
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement(sql);
            inserir.executeUpdate();
            System.out.println("Excluido com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }

    public void atendimento(int num_atend) {
        String sql = "DELETE FROM tb_atendimento WHERE num_atendimento = (' " + num_atend + "')";
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement(sql);
            inserir.executeUpdate();
            System.out.println("Excluido com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
}
