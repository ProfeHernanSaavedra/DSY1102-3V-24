/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class AutoPpal {
    
    //main + tab
    public static void main(String[] args) {
        
        Auto objAuto = new Auto();
        System.out.println(objAuto.getMarca());
        System.out.println(objAuto.getModelo());
        
        System.out.println("*************************");
         
        Auto objAuto3 = new Auto();
        objAuto3.setMarca("KIA");
        objAuto3.setModelo("SORENTO");
        System.out.println(objAuto3.toString());
        objAuto3.imprimirAuto();
        System.out.println("*************************");
        
        
        Auto objAuto2 = new Auto("KIA", "Morning", "Bencina", 2022, 1500);
        System.out.println(objAuto2.getMarca());
        System.out.println(objAuto2.getModelo());
        System.out.println("Modelo:" + objAuto.getModelo() + " Marca: " + objAuto.getMarca());
                
        System.out.println(objAuto2.toString());
        
        
    }
    
}
