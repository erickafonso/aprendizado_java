/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testeconta;

/**
 *
 * @author 182310022
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TesteConta {
public static Scanner ler = new Scanner(System.in);
public static ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
    public static void main(String[] args) {
        
        
        System.out.println("Bem vindo ao BANCO");
        System.out.println("Digite uma OPÇÃO");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Aplicar rendimento e imprimir saldo");
        System.out.println("5 - Imprimir dados da conta");
        System.out.println("6 - Sair");
        int opcao = ler.nextInt();
        switch(opcao){
            case 1:
                
            break;
            case 2:
                
            break;
            case 3:
            
                break;
            case 4:
            
                break;
            case 5:
            
                break;
            case 6:
            
                break;
        }
        
        
    }
    public void CriarConta(){
        System.out.println("Digite o seu nome: ");
        String nome= ler.next();
        System.out.println("Qual tipo de conta você deseja criar? ");
        System.out.println("1 - Comum");
        System.out.println("2 - Especial");
        System.out.println("3 - Poupança");
        int opcao = ler.nextInt();
        switch(opcao){
            case 1:
                contas.add(new ContaBancaria(nome));
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        }
    }
}
