/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Estudiantes
 */
public class Moto extends Vehiculos {
    
  
    @Override
    void acelerar(){
        System.out.println("..acelerando...");
    }
    @Override
    void frenar(){
        System.out.println("...frenando");
    }
    void derrapar(){
        System.out.println("..derrapar...");
    }
}
    