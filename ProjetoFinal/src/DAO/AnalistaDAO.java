/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.Scanner;
import projetofinal.Inserir;

public class AnalistaDAO {
    
    Scanner scanner = new Scanner(System.in);    
    Inserir inserir = new Inserir();

    private String nome;
    
    public void inserir() {
        System.out.println("CADASTRO DE ANALISTA");
        System.out.print("Digite o nome completo do analista: ");
        this.nome = scanner.nextLine().toUpperCase();                
        inserir.analista(this.nome);        
    }  
}
