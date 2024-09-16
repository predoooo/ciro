/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carro carro = new carro("Toyota" , "Corola");
        
        carro.andar();
    }
   
}

class carro {
private String marca;
private String nome;
public carro(String marca, String nome){
    this.marca = marca;
    this.nome = nome;
}
public void andar (){
    System.out.println(" o carro "  +  marca  + " " + nome + " está andando " );
}
}



