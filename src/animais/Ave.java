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
public class Ave extends Animal{

    public Ave(int idade, double peso, double comprimento) {
        super(idade, peso, comprimento);
    }

    public Ave() {
    }
    public void voar(){
        
    }
    public void porOvos(){
        
    }        
    public void crescer(){
        peso*=0.2;
        comprimento*=0.01;  
    }
}
