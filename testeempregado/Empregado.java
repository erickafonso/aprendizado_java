/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeempregado;

/**
 *
 * @author 182310022
 */
public class Empregado {
    
     private String nome, sobrenome;
     double salarioMensal;
     
     public Empregado(String nome, String sobrenome, double salarioMensal){
         this.nome = nome;
         this.sobrenome = sobrenome;
         this.salarioMensal = salarioMensal;
     }

     
     
     public void setNome(String nome){
         this.nome = nome;
     }
     public void setSobrenome(String sobrenome){
         this.sobrenome = sobrenome;
     }
     
     public void setSalarioMensal(double salarioMensal){
         this.salarioMensal = salarioMensal;
     }
     
     public String getNome(){
         return nome;
     }
     public String getSobrenome(){
         return sobrenome;
     }
     public double getSalarioMensal(){
         return salarioMensal;
     }
     
     
     
}
