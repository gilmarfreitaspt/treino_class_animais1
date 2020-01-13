/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author formando
 */
public class Peixe extends Animal{

    public Peixe() {
    }

    public Peixe(int idade, double peso, double comprimento) {
        super(idade, peso, comprimento);
    }
   
    final public void nadar(){
         System.out.println("O peixe sabe nadar"); 
    }
    public void porOvos(){
        
    }
    
}
