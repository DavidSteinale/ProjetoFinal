package DAO;

import java.util.Scanner;
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
    public void lista(){
        Lista lista = new Lista();
        lista.analista();        
    }
}
