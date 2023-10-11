/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author 182310022
 */
public class Professor extends Pessoa {
    private float salario;
    
    public Professor(String nome, String endereco, int idade, float salario){
            super(nome, endereco, idade);
            this.salario = salario;
        }
    public float getSlario(){
        return salario;
    }
    public void setSalario(Float salario){
        this.salario = salario;
        
        
    }
}
