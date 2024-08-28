/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 26-08-2024
 */
public class Condiciones {
    
    private int edad;
    private String nombre;

    public Condiciones() {
    }

    public Condiciones(int edad, String nombre) {
        //this.edad = edad;
        this.setEdad(edad);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >0)
        {
            this.edad = edad;
        }
        else{
            System.out.println("La edad debe ser mayor a cero!");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pruebaCondiciones()
    {
        if (this.edad >= 18)
        {
            //sout + tab
            System.out.println("Ud es mayor de edad");
            
        }
        else
        {
            if (this.edad >= 12 && this.getEdad()<=17) {
                System.out.println("Ud es un joven");
            }
            else{
                System.out.println("Ud es menor de edad, es un niño");
            } 
        }
    }
    
    
    public static void main(String[] args) {
        
        Condiciones con1 = new Condiciones(15, "Juan");
        con1.pruebaCondiciones();
        System.out.println(con1.getEdad());
        con1.setEdad(4);
        con1.pruebaCondiciones();
        System.out.println(con1.getEdad());
        con1.setEdad(56);
        con1.pruebaCondiciones();
        System.out.println(con1.getEdad());
        con1.setNombre("Maria");
        System.out.println(con1.getNombre());
    }
    
    
    
}
