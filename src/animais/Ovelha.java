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
public class Ovelha extends Mamifero{

    public Ovelha() {
    }

    public Ovelha(int idade, double peso, double comprimento) {
        super(idade, peso, comprimento);
    }

   
  public void emitirSom(){
       System.out.println("Sou uma Ovelha") ;

  }  
}
