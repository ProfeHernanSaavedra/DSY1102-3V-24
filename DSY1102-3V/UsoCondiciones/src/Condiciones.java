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
        this.edad = edad;
        //this.setEdad(edad);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
//        if (edad >0)
//        {
//            this.edad = edad;
//        }
//        else{
//            System.out.println("La edad debe ser mayor a cero!");
//        }
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Condiciones{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }

    
    
  
    
    
    
}
