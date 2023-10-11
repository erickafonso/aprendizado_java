/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author 182310022
 */
public class Aluno extends Pessoa{
    private int matricula;
    private float nota1,nota2,nota3;
    private static int AuxMatricula=20230001;
    
    public Aluno(String nome, String endereco, int idade, float nota1, float nota2,float nota3){
            super(nome, endereco, idade);
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            matricula = AuxMatricula++;
        }
    public float getMatricula(){
        return matricula;
    }
    
    public float getNota1(){
        return nota1;
    }
    public float getNota2(){
        return nota2;
    }
    public float getNota3(){
        return nota3;
    }
    public void setNota1(float nota1){
        this.nota1= nota1;
    }
    public void setNota2(float nota2){
        this.nota2= nota2;
    }
    public void setNota3(float nota3){
        this.nota3= nota3;
    }
    public void dados(){
        super.dados();
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.println("Media: "+Calculamedia(nota1,nota2,nota3));
    }
    private double Calculamedia(float nota1, float nota2, float nota3){
        float media = (nota1 + nota2 + nota3)/3;
        return media;
    }

}
