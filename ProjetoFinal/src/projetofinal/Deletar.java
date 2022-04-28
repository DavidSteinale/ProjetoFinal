
package projetofinal;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Deletar {
    Conexao conn = new Conexao();
    
    public void analista(int codigo_analista){
        String sql = "DELETE FROM analista WHERE id_analista = (' " + codigo_analista + "')";
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement(sql);
            inserir.executeUpdate();
            System.out.println("Excluido com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }        
    }
    
}
