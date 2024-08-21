/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class PizzaPpal {
    
    //método prinicipal de java, el que ejecuta --> main
    //main + tab
    public static void main(String[] args) {
        
        //crear objetos!
        
        Pizza pizza3 = new Pizza("Vegana","mediana","delgada");
        pizza3.preparar();
        pizza3.calentar();
        
        Pizza pizza1 = new Pizza();
        //pizza1.nombre = "pepperoni";
        pizza1.setNombre("pepperoni");
        //pizza1.tamaño = "grande";
        pizza1.setTamaño("grande");
        //pizza1.masa = "gruesa";
        pizza1.setMasa("gruesa");
        
        System.out.println(pizza1.getNombre());
        
        pizza1.preparar();
        pizza1.calentar();
        System.out.println(pizza1.preparar2("Trigo"));
        System.out.println(pizza1.calcular(3, 5));
        
        System.out.println("");
        Pizza pizza2 = new Pizza();
        //pizza2.nombre = "vegetariana";
        pizza2.setNombre("vegetariana");
        //pizza2.tamaño = "familiar";
        pizza2.setTamaño("familiar");
        //pizza2.masa = "delgada";
        pizza2.setMasa("delgada");
        
        pizza2.preparar();
        pizza2.calentar();
        
        
        
    }
    
}
