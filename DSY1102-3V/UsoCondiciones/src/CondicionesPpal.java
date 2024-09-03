
import java.util.Scanner;

/**
 *
 * @author USRVI-LC4
 */
public class CondicionesPpal {
    
    public static void main(String[] args) {
        
        int edad,opcion;
        String nombre,resp;
        Scanner leer = new Scanner(System.in);
        Condiciones con1 = new Condiciones();
//        Condiciones con1 = new Condiciones(15, "Juan");
        ValidacionesCondiciones val = new ValidacionesCondiciones();
//        val.pruebaCondiciones(con1.getEdad());
//        System.out.println(con1.getEdad());
//        con1.setEdad(4);
//        val.pruebaCondiciones(con1.getEdad());
//        System.out.println(con1.getEdad());
//        con1.setEdad(56);
//        val.pruebaCondiciones(con1.getEdad());
//        System.out.println(con1.getEdad());
//        con1.setNombre("Maria");
//        System.out.println(con1.getNombre());
//        
//        System.out.println("");
//        System.out.println("***********");
          
        resp = "s";    
        while (resp.equals("s")) {
            System.out.println("------MENU-------");
            System.out.println("1. Ingrese datos");
            System.out.println("2. Muestre datos");
            opcion = leer.nextInt();
            
            if (opcion == 1 ) {
                System.out.println("ESTO AL PRINCIPIO!!!!!");       
                System.out.println("Ingrese su edad: ");
                edad = leer.nextInt();

                if (val.mayorCero(edad)) {
                    con1.setEdad(edad);
                }
                else{
                    do { 
                        System.out.println("La edad debe ser mayor a cero");
                        System.out.println("Ingrese su edad: ");
                        edad = leer.nextInt();
                    }
                    while (edad < 0);
                    con1.setEdad(edad);
                }
                
                System.out.println("Ingrese su nombre: ");
                nombre = leer.next();
                con1.setNombre(nombre);
            }
            else{
                if (opcion == 2)
                {
                    System.out.println(con1.toString());
                }
            }
            System.out.println("Deseas ingresar nuevamente? (s/n)");
            resp = leer.next();
        }

        
        
    }
    
}
