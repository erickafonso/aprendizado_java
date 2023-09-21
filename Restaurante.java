/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author 182310022
 */
public class Restaurante {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int opcao;
        float feijoada = 25, macarronada = 15, galinha_caipira = 30, carne_de_sol = 30;
        
        System.out.println("nº |Prato           |Preço     |");
        System.out.println("1  |Feijoada        |R$25,00   |");
        System.out.println("2  |Macarronada     |R$15,00   |");
        System.out.println("3  |Galinha Caipira |R$30,00   |");
        System.out.println("4  |Carne de sol    |R$30,00   |");
        System.out.println("\n");
        System.out.print("Escolha uma opção: ");
        opcao = ler.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Você comprou FEIJOADA!!! valor do carrinho: R$ " + feijoada);
                break;
                
            case 2:
               System.out.println("Você comprou MACARRONADA!!! valor do carrinho: R$ " + macarronada);
               break; 
            
            case 3:
               System.out.println("Você comprou GALINHA CAIPIRA!!! valor do carrinho: R$ " + galinha_caipira);
               break; 
        
            case 4:
               System.out.println("Você comprou CARNE DE SOL!!! valor do carrinho: R$ " + carne_de_sol);
               break; 
        
            default:
                System.out.println("Opção inválida");
        }
        
    }
}
