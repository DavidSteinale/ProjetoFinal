/*
 * PROJETO FINAL DO CURSO #BoraSerTech - PROJETO DE DATABASE MYSQL
 */
package projetofinal;

import DAO.AnalistaDAO;
import DAO.AtendimentoDAO;
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
        AtendimentoDAO atendimento = new AtendimentoDAO();

        String op;

//        

do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Iniciar Atendimento.");
            System.out.println("2 - Listar Atendimentos.");
            System.out.println("3 - Deletar Atendimento.");
            System.out.println("4 - Atualizar os dados do Atendimento.");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    atendimento.inserir();
                    break;
                case 2:
                    atendimento.lista();
                    break;
                case 3:
                    atendimento.deletar();
                    break;
                case 4:
                    atendimento.atualizar();
                    break;
            }
            System.out.println("Deseja voltar ao menu?");
            op = scanner.next().toUpperCase();
        } while (op.equalsIgnoreCase("sim"));
    }
}
