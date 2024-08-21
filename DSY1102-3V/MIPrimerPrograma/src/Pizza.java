/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public class Pizza {
    
    private String nombre;
    private String tamaño;
    private String masa;
    
    //metodos constructores

    public Pizza() {
    }

    public Pizza(String nombre, String tamaño, String masa) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
     
    //metodos customer
    public void preparar()
    {
       System.out.println("Preparando " + nombre + " de tamañao " + tamaño);
    }
    
    public void calentar()
    {
        //sout + tab
        System.out.println("Calentando la pizza " + nombre + " con masa " + masa);
        
    }
    
    public String preparar2(String tipoHarina){
        
        String harina = tipoHarina;
        //double pes = peso;
        return harina;
    }
    
    public int calcular(int num1, int num2)
    {
        int suma = num1 + num2;
        return suma;
    }
    
    
    
}
