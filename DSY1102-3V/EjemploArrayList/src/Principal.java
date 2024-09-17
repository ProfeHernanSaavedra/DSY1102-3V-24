
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USRVI-LC4
 */
public class Principal {
    
    public static void main(String[] args) {
        
        args = new String[5];
        
        args[0]  ="juan";
        args[1]  ="maria";
        args[2]  ="pedro";
        args[3]  = "jose";
        
        System.out.println(args[4]);
        
        List<String> lista;
        lista = new ArrayList<String>();
        
        lista.add("Pedrito");
        lista.add("Francisca");
        lista.add("Valeska");
        
        System.out.println(lista);
        System.out.println(lista.get(0));
        
        //foreach
        //fore+tab
        for (String elemento : lista) {
            
            System.out.println(elemento);
        }
        
        Persona per1 = new Persona("jaime", 24, 'm');
        Persona per2 = new Persona("Paola",30,'f');
        
        ArrayList<Persona> personas  = new ArrayList<>();
        
        personas.add(per1);
        personas.add(per2);
        
        System.out.println(personas);
        
        for (Persona per : personas) {
            System.out.println(per.getNombre());
        }
        
        
        
    }
    
}
