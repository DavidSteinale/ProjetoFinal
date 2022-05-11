package DAO;

import java.util.Scanner;
import projetofinal.Atualizar;
import projetofinal.Deletar;
import projetofinal.Inserir;
import projetofinal.Lista;

public class ContatoDAO {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String telefone;
    private String email;

    public void inserir() {
        Inserir inserir = new Inserir();
        System.out.println("CADASTRO DE CONTATO");
        System.out.print("Digite o nome completo do contato: ");
        this.nome = scanner.nextLine().toUpperCase();
        System.out.print("Digite o telefone: ");
        this.telefone = scanner.nextLine().toUpperCase();
        System.out.print("Digite o E-mail: ");
        this.email = scanner.nextLine().toUpperCase();
        inserir.contato(this.nome, this.telefone, this.email);
    }

    public void lista() {
        Lista lista = new Lista();
        lista.contato();
    }

    public void deletar() {
        System.out.println("Informe o codigo do contato a ser excluido?");
        int cod_contato = scanner.nextInt();
        Deletar deletar = new Deletar();
        deletar.contato(cod_contato);
    }


    public void atualizar() {
        System.out.println("Informe o id do contato a ser atualizado:");
        int cod_contato = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o novo nome:");
        String nome = scanner.nextLine().toUpperCase();
        System.out.println("Informe o novo telefone:");
        String telefone = scanner.nextLine().toUpperCase();
        System.out.println("Informe o novo E-mail:");
        String email = scanner.nextLine().toUpperCase();
        Atualizar atualizar = new Atualizar();
        atualizar.contato(nome, telefone, email, cod_contato);
    }
}
