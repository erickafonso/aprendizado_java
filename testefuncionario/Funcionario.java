/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testefuncionario;

/**
 *
 * @author 182310022
 */
public class Funcionario {
    String nome, sobrenome;
    int horasTrabalhadas;
    float valorPorHora;
    
    public String nomeCompleto()
    {
        return nome +" "+ sobrenome;
    }
    public float calcularSalario()
    {
        return horasTrabalhadas*valorPorHora;
    }
    
    public void incrementarHoras(int x)
    {
        horasTrabalhadas += x;
    }
}
