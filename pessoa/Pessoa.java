/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pessoa;

/**
 *
 * @author 182310022
 */
public class Pessoa {
        private String nome;
        private String endereco;
        private int idade;
        
        public Pessoa(String nome, String endereco, int idade){
            this.nome = nome;
            this.endereco = endereco;
            this.idade = idade;
        }
        
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getIdade(){
        return idade;
    }
    public void dados(){
        System.out.println("**********************");
        System.out.println("Nome: "+ nome);
        System.out.println("Endereco: "+ endereco);
        System.out.println("Idade: "+ idade);
    }
            
}
