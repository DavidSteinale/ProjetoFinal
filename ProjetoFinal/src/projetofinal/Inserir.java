package projetofinal;

import com.sun.jdi.connect.Connector;
import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Inserir {

    Conexao conn = new Conexao();

    public void analista(String nome) {

        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement("INSERT INTO analista(nome_analista)\n"
                    + "VALUES (?)");
            inserir.setString(1, nome);
            inserir.executeUpdate();
            System.out.println("Cadastrado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }

    public void atendimento(String descricao, int id_emp, int id_ana) {
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement("INSERT INTO tb_atendimento(descricao, id_empresa, id_analista)\n"
                    + "VALUES (?,?,?)");
            inserir.setString(1, descricao);
            inserir.setInt(2, id_emp);
            inserir.setInt(3, id_ana);
            inserir.executeUpdate();
            System.out.println("Cadastrado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
}
