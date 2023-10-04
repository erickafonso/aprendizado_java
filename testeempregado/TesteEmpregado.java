/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testeempregado;

/**
 *
 * @author 182310022
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TesteEmpregado {

    public static void main(String[] args) {
        CriaEmpregado();
        
    }
    public static void CriaEmpregado(){
        //cria arraylist de objetos
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        Scanner ler = new Scanner(System.in);
        int contador = 1;
        while(contador<3){
        System.out.println("CRIAÇÃO DO FUNCIONARIO " + contador);
        System.out.print("Digite o nome do funcionario: ");
        String nome = ler.next();
        System.out.print("Digite o sobrenome do funcionário: ");
        String sobrenome = ler.next();
        System.out.print("Digite o salário mensal do funcionário: ");
        double salarioMensal = ler.nextDouble();
        //adiciona objeto a lista
        empregados.add(new Empregado(nome,sobrenome,salarioMensal));
        //printa a lista inteira
        System.out.println(empregados);
        //printa só o nome do objeto no indice 0 da lista
        System.out.println(empregados.get(0).getNome());
        contador++;
        }
    }
}
