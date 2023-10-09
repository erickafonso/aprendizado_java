/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeconta;

/**
 *
 * @author 182310022
 */
public class ContaPoupanca extends ContaBancaria{
    private int DiaRendimento;
    private boolean rendAplicDia = false;
    
    public void calcularNovoSaldo(float taxaRend){
        float rend= (taxaRend*saldo)*DiaRendimento;
        System.out.println("Sua conta rendeu: R$ " +rend +" este mes!");
        if(rendAplicDia == false){

            saldo += (taxaRend*saldo)*DiaRendimento ;
            rendAplicDia = true;
        }
        
        
    }
    
}
