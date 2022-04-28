
package projetofinal;

import com.sun.jdi.connect.Connector;
import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Inserir {
    Conexao conn = new Conexao();
    
      
    public void analista(String nome){
        String sql = "INSERT INTO analista(nome_analista)\n"
                + "VALUES (' " + nome + "')";
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement(sql);
            inserir.executeUpdate();
            System.out.println("Cadastrado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }        
    }    
}
