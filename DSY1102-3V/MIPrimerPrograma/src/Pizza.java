/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public class Pizza {
    
    public  String nombre;
    private String tamaño;
    private String masa;
    
    //metodos
    public void preparar()
    {
       System.out.println("Preparando " + nombre + " de tamañao " + tamaño);
    }
    
    public void calentar()
    {
        //sout + tab
        System.out.println("Calentando la pizza " + nombre + " con masa " + masa);
        
    }
    
    //método prinicipal de java, el que ejecuta --> main
    //main + tab
    public static void main(String[] args) {
        
        //crear objetos!
        Pizza pizza1 = new Pizza();
        pizza1.nombre = "pepperoni";
        pizza1.tamaño = "grande";
        pizza1.masa = "gruesa";
        
        pizza1.preparar();
        pizza1.calentar();
        
        System.out.println("");
        Pizza pizza2 = new Pizza();
        pizza2.nombre = "vegetariana";
        pizza2.tamaño = "familiar";
        pizza2.masa = "delgada";
        
        pizza2.preparar();
        pizza2.calentar();
    }
    
}
