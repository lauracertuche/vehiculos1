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
public class Vehiculos {
    public String marca;
    private int cilindraje;
    private String modelo;
    private int año;
    
  void acelerar(){
     
 }
  void frenar(){
    
}
    public static void main(String[] args) {
        
        fichavehiuclo miFicha;
        miFicha=new fichavehiuclo();
        
        miFicha.setVisible(true);
        
        Moto miMoto=new Moto();
        miFicha.miMotoEnFichaVehiculo=miMoto;
        // TODO code application logic here
    }
}

