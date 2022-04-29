package projetofinal;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Atualizar {
    Conexao conn = new Conexao();

    public void analista(String nome, int id){
        String sql = "UPDATE analista SET nome_analista = ' " + nome + "'WHERE ID_ANALISTA='"+ id + "'";
        System.out.println("nome - >" + nome);
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement(sql);
            inserir.executeUpdate();
            System.out.println("Atualizado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }        
    } 
}
