/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public class ValidacionesCondiciones {
    
    public void pruebaCondiciones(int edad)
    {
        if ( edad >= 18)
        {
            //sout + tab
            System.out.println("Ud es mayor de edad");
            
        }
        else
        {
            if (edad >= 12 && edad <=17) {
                System.out.println("Ud es un joven");
            }
            else{
                System.out.println("Ud es menor de edad, es un niño");
            } 
        }
    }
    
    public boolean mayorCero(int edad)
    {
        if (edad > 0){
            return true;
        }
        return false;
    }
    
}
