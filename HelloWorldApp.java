/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloworldapp;
import java.util.Scanner;
/**
 *
 * @author 182310022
 */
public class HelloWorldApp {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("O primeiro programa a gente nunca esquece! (la ele)");
        System.out.println("\n\n");
        System.out.println("Erick Afonso da Costa Chagas");
       // System.out.println("\n");
        System.out.println("Endereço: Avenida da Serraria, 1844");
        //System.out.println("\n");
        System.out.println("telefone: (51)989275955");
        System.out.println("\n\n");
        System.out.println("********");
        System.out.println("********");
        System.out.println("********");
        System.out.println("********");
        System.out.println("\n\n");
        System.out.println("BOM DIA");
        System.out.print("Informe o seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Nome digitado: " + nome);
        System.out.print("Informe a sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Idade digitada: " + idade);
        System.out.print("Informe o seu salario: ");
        float salario = ler.nextFloat();
        System.out.println("Salário digitado: " + salario);
        
        
        System.out.println("Digite un numero: ");
        int numero = ler.nextInt();

        
        
    }
    
    
    
    
}
