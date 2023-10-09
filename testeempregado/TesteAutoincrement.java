package com.mycompany.testeempregado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 182310022
 */
public class TesteAutoincrement {
     
     private int id = 0;
     private static  int IDaux = 0;

    public TesteAutoincrement(){
        this.id = IDaux++;
        
    }
    
    public int getId(){
        
        return id;
    }
}
