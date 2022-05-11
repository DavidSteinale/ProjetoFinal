/*
 * PROJETO FINAL DO CURSO #BoraSerTech - PROJETO DE DATABASE MYSQL
 */
package projetofinal;

import DAO.AnalistaDAO;
import DAO.AtendimentoDAO;
import DAO.ContatoDAO;
import DAO.EmpresaDAO;
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
        ContatoDAO contato = new ContatoDAO();
        EmpresaDAO empresa = new EmpresaDAO();
        AtendimentoDAO atendimento = new AtendimentoDAO();
        
        String op;
        String opMenu1;
        


        empresa.inserir();
        do {
            System.out.println("=====Selecione uma opção=====");
            System.out.println("1 - Atendimento");
            System.out.println("2 - Empresa");
            System.out.println("3 - Analista");
            System.out.println("4 - Contato");
            System.out.println("5 - Sair");

            String opAtendimento;
            String opEmpresa;
            String opAnalista;
            String opContato;

            int menuPrincipal = scanner.nextInt();

            switch (menuPrincipal) {
                case 1:
                    do {
                        System.out.println("=====Selecione uma Opção=====");
                        System.out.println("1 - Cadastro de Atendimento");
                        System.out.println("2 - Listar Atendimentos");
                        System.out.println("3 - Deletar Atendimento");
                        System.out.println("4 - Atualizar os dados do Atendimento");

                        int menuAtendimento = scanner.nextInt();

                        switch(menuAtendimento){
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
                        System.out.println("Deseja voltar ao Menu Analista? SIM/NAO");
                        opAtendimento = scanner.next();

                    } while (opAtendimento.equalsIgnoreCase("nao"));
                    break;
                case 2:
                    do {
                        System.out.println("=====Selecione uma Opção=====");
                        System.out.println("1 - Cadastro de Empresa");
                        System.out.println("2 - Listar Empresas");
                        System.out.println("3 - Deletar Empresa");
                        System.out.println("4 - Atualizar os dados da Empresa");

                        int menuEmpresa = scanner.nextInt();

                        switch (menuEmpresa) {
                            case 1:
                                empresa.inserir();
                                break;
                            case 2:
                                empresa.listar();
                                break;
                            case 3:
                                empresa.deletar();
                                break;
                            case 4:
                                empresa.atualizar();
                                break;
                        }
                        System.out.println("Deseja voltar ao Menu Analista? SIM/NAO");
                        opEmpresa = scanner.nextLine();

                    } while (opEmpresa.equalsIgnoreCase("nao"));
                    break;
                case 3:
                    do {
                        System.out.println("===Selecione uma Opção===");
                        System.out.println("1 - Cadastrar Analista");
                        System.out.println("2 - Listar Analistas");
                        System.out.println("3 - Deletar Analista");
                        System.out.println("4 - Atualizar os dados do Analista");

                        int menuAnalista = scanner.nextInt();

                        switch (menuAnalista) {
                            case 1:
                                analista.inserir();
                                break;
                            case 2:
                                analista.lista();
                                break;
                            case 3:
                                analista.deletar();
                                break;
                            case 4:
                                analista.atualizar();
                                break;
                        }
                        System.out.println("Deseja voltar ao Menu Analista? SIM/NAO");
                        opAnalista = scanner.nextLine();
                    } while (opAnalista.equalsIgnoreCase("nao"));
                    break;
                case 4:
                    do {
                        System.out.println("===Selecione uma Opção===");
                        System.out.println("1 - Cadastrar Contato");
                        System.out.println("2 - Listar Contatos");
                        System.out.println("3 - Deletar Contato");
                        System.out.println("4 - Atualizar os dados do Contato");

                        int menuContato = scanner.nextInt();

                        switch (menuContato) {
                            case 1:
                                contato.inserir();
                                break;
                            case 2:
                                contato.lista();
                                break;
                            case 3:
                                contato.deletar();
                                break;
                            case 4:
                                contato.atualizar();
                                break;
                        }

                        System.out.println("Deseja voltar ao Menu Analista? SIM/NAO");
                        opContato = scanner.nextLine();
                    } while (opContato.equalsIgnoreCase("nao"));
                    break;
                case 5:
                    break;
            }

            System.out.println("Tem certeza que deseja sair do sistema SIM/NAO?");
//            System.out.println("SIM/NAO5");
            opMenu1 = scanner.next();
        } while (opMenu1.equalsIgnoreCase("nao"));

  };
}
