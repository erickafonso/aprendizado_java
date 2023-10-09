/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeconta;

/**
 *
 * @author 182310022
 */
public class ContaEspecial extends ContaBancaria{
    private float limite = -500;
    
    public void sacar(float valor){
        float calcSaldo = super.saldo - valor;
        if(calcSaldo>=limite){
            super.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    public void dados(){
        System.out.println("Limite da conta: "+ limite);
    }
    
}
