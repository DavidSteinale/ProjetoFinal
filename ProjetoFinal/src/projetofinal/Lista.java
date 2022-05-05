package projetofinal;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Util;

public class Lista {

    Conexao acesso = new Conexao();
    Util util = new Util();

    public void analista() {
        try {            
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("SELECT * FROM analista");
            ResultSet resultado = pesquisa.executeQuery();
            System.out.println("----------------------------------------");
            System.out.println("ANALISTA CADASTRADOS");
            System.out.println("----------------------------------------");
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("id_analista"));
                String nome = resultado.getString("nome_analista");
                System.out.println(codigo + " - "+ util.preencheComEspaco(nome, " ", 25, 1));
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }  
    
     public void empresa() {
        try {            
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("SELECT * FROM analista");
            ResultSet resultado = pesquisa.executeQuery();
            System.out.println("----------------------------------------");
            System.out.println("ANALISTA CADASTRADOS");
            System.out.println("----------------------------------------");
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("id_analista"));
                String nome = resultado.getString("nome_analista");
                System.out.println(codigo + " - "+ util.preencheComEspaco(nome, " ", 25, 1));
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    } 
    
}
