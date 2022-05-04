package DAO;

import java.util.Scanner;
import projetofinal.Atualizar;
import projetofinal.Deletar;
import projetofinal.Inserir;
import projetofinal.Lista;

public class AnalistaDAO {

    Scanner scanner = new Scanner(System.in);

    private String nome;

    public void inserir() {
        Inserir inserir = new Inserir();
        System.out.println("CADASTRO DE ANALISTA");
        System.out.print("Digite o nome completo do analista: ");
        this.nome = scanner.nextLine().toUpperCase();
        inserir.analista(this.nome);
    }

    public void lista() {
        Lista lista = new Lista();
        lista.analista();
    }

    public void deletar() {
        System.out.println("Informe o codigo do analista a ser excluido?");
        int cod_analista = scanner.nextInt();
        Deletar deletar = new Deletar();
        deletar.analista(cod_analista);
    }

    public void atualizar() {
        System.out.println("Informe o id do analsita a ser atualizado:");
        int cod_analista = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o novo nome do analista:");
        String nome = scanner.nextLine().toUpperCase();
        Atualizar atualizar = new Atualizar();
        atualizar.analista(nome, cod_analista);
    }

}
