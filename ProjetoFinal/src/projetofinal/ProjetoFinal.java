/*
 * PROJETO FINAL DO CURSO #BoraSerTech - PROJETO DE DATABASE MYSQL
 */
package projetofinal;

import DAO.AnalistaDAO;
import conexao.Conexao;
import java.util.Scanner;

/**
 *
 * @author
 *
 * David Alexandre Stein da Silva Isadora da Silva Oliveira Natalia Giachini
 * Bachega
 *
 */
public class ProjetoFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AnalistaDAO analista = new AnalistaDAO();
        

        System.out.println("Selecione uma opção:");
        System.out.println("1 - Cadastro de analista.");
        System.out.println("2 - Listar de analsita.");
        System.out.println("3 - Deletar de analsita.");
        
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                analista.inserir();
                break;
            case 2:
                analista.lista();
                break;
            case 3:
                analista.deletar();
                break;
        }

    }
}
