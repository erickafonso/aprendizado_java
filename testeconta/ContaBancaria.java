/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeconta;

/**
 *
 * @author 182310022
 */
public class ContaBancaria {
    private String cliente;
    private int num_conta=0;
    private static int auxConta=0;
    protected float saldo=0;
    
    public ContaBancaria(String cliente){
        this.cliente = cliente;
        this.num_conta = auxConta++;
        
    }
    
    public void sacar(float valor){
        if(saldo>= valor){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    public void depositar(float valor){
        if(valor<=0){
            System.out.println("Valor inválido");
        }
        else{
            saldo+=valor;
        }
    }
    public float getSaldo(){
        return saldo;
    }
    public void dados(){
        System.out.println("Nome do Cliente: "+cliente);
        System.out.println("nº da Conta: "+num_conta);
        System.out.println("Saldo: "+saldo);
    }
    
}
