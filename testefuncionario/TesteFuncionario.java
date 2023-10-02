/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testefuncionario;

/**
 *
 * @author 182310022
 */
import java.util.Scanner;
public class TesteFuncionario {

    public static void main(String[] args) {
        boolean menu = true;
        Scanner ler = new Scanner(System.in);
        Funcionario f = new Funcionario();
        
        while (menu)
        {
            System.out.println("DIGITE UMA OPÇÃO: ");
            System.out.println("1 - Cadastrar nome completo");
            System.out.println("2 - Calcular Salário");
            System.out.println("3 - Imprimir cadastro");
            System.out.println("0 - SAIR");
            int opcao = ler.nextInt();
            switch(opcao)
            {
                case 1:
                    System.out.print("Digite seu NOME: ");
                    f.nome = ler.next();
                    System.out.print("Digite o seu SOBRENOME: ");
                    f.sobrenome = ler.next();
                    
                break;
                
                case 2:
                    System.out.print("Informe as QUANTIDADE de horas que você trabalhou: ");
                    f.horasTrabalhadas = ler.nextInt();
                    
                    
                    System.out.print("Informe o VALOR da hora trabalhada: ");
                    f.valorPorHora = ler.nextFloat();
                    System.out.print(" Você fez horas extras?(s/n) ");
                    String sn = ler.next();
                        switch(sn)
                        {
                            case "s":
                                System.out.print("Informe as QUANTIDADE de horas EXTRAS que você trabalhou: ");
                                f.incrementarHoras(ler.nextInt());
                            break;
                            
                            case "n":
                            break;
                            
                            default:
                                System.out.println(":(");
                        }
                    System.out.println("Você receberá um salário de R$ " + f.calcularSalario());
                    
                break;
                
                case 3:
                    System.out.println("Bom dia "+ f.nomeCompleto());
                break;
                
                case 0:
                    menu = false;
                    System.out.println("TCHAU");
                break;
                
            }
            
        }
    }
}
