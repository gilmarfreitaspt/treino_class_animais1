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
public class Animal {
    private int idade;
    protected double peso;
    protected double comprimento;

  
    
    public Animal() {
    }

    public Animal(int idade, double peso, double comprimento) {
        this.idade = idade;
        this.peso = peso;
        this.comprimento = comprimento;
    }
    public void crescer()
    {}        
    
    
}
