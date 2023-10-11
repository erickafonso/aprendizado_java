/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author 182310022
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static ArrayList<Professor> professores = new ArrayList<Professor>();
    public static void main(String[] args) {
        boolean menu = true;
        String nome, endereco;
        int idade;
        
        while(menu){
        System.out.println("Bem vindo ao PORTAL DO ALUNO");
        System.out.println("DIGITE UMA OPÇÃO");
        System.out.println("1 - Cadastrar Professor");
        System.out.println("2 - Cadastrar Aluno");
        System.out.println("3 - Exibir Professor");
        System.out.println("4 - Exibir Aluno");
        System.out.println("5 - Editar nome do Professor");
        System.out.println("6 - Excluir Professor");
        System.out.println("7 - Sair");
        int opcao = ler.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Digite o nome: ");
                ler.nextLine();
                nome = ler.nextLine();
                System.out.println("Digite o endereço: ");
                endereco = ler.nextLine();
                System.out.println("Digite a idade: ");
                idade = ler.nextInt();
                System.out.println("Digite o salario: ");
                float salario = ler.nextFloat();
                Professor p1 = new Professor(nome,endereco,idade,salario);
                professores.add(p1);
            break;
            case 2:
            break;
            case 3: 
                System.out.println("Professores:");
                if( professores.isEmpty()){
                    System.out.println("Nenhum cadastro!");   
                }
                else{
                    for(Professor p: professores){
                        p.dados();
                    }
                }
            break;
            case 4:
                
            break;
            case 5:
                System.out.println("Professores:");
                if( professores.isEmpty()){
                    System.out.println("Nenhum cadastro!");   
                }
                else{
                    for(int p = 0; p< professores.size(); p++){
                        
                        professores.get(p).dados();
                        System.out.println("INDICE do professor: " + p);
                    }
                    System.out.println("Digite o INDICE do professor que você deseja alterar o nome: ");
                    int indice = ler.nextInt();
                    System.out.println("Digite o novo NOME do professor: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    professores.get(indice).setNome(nome);
                }
                break;
            case 6:
                System.out.println("Professores:");
                if( professores.isEmpty()){
                    System.out.println("Nenhum cadastro!");   
                }
                else{
                    for(int p = 0; p< professores.size(); p++){
                        
                        professores.get(p).dados();
                        System.out.println("INDICE do professor: " + p);
                    }
                    System.out.println("Digite o INDICE do professor que você deletar: ");
                    int indice = ler.nextInt();
                    professores.remove(indice);
                }
                break;
            case 7:
                menu = false;
                break;
        }
        
        
        }
    }
}
