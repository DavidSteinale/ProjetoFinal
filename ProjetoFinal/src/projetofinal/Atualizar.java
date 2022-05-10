package projetofinal;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Atualizar {

    Conexao conn = new Conexao();

    public void analista(String nome, int id) {

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

    //public void atendimento(String descricao, int id_emp, int id_ana, int num_atend) 
    public void atendimento(String descricao, int num_atend) {
//        String sql = "UPDATE tb_atendimento SET descricao = ' " + descricao + "'WHERE num_atendimento='"+ num_atend + "'";
//        String sql = "UPDATE tb_atendimento SET id_empresa = ' " + id_emp + "'WHERE num_atendimento='"+ num_atend + "'";
//        String sql = "UPDATE tb_atendimento SET id_analista = ' " + id_ana + "'WHERE num_atendimento='"+ num_atend + "'";

        try {
            PreparedStatement alterar = conn.getConexao().prepareStatement("UPDATE tb_atendimento SET descricao = ? WHERE num_atendimento = ?");
            alterar.setString(1, descricao);
            alterar.setInt(2, num_atend);
            alterar.executeUpdate();
            System.out.println("Atualizado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
}
