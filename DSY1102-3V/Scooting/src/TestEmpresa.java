
/**
 *
 * @author USRVI-LC4
 */
public class TestEmpresa {
    
    public static void main(String[] args) {
        
        Puesto puesto1 = new Puesto(1, "gerente");
        Puesto puesto2 = new Puesto(2,"Ejecutivo");
        
        Empleado emple1 = new Empleado("111-1","Valeska", 'f', 2, 22, puesto1);
        Empleado emple2 = new Empleado("222-2","Jose Luis Muñoz", 'm', 5, 31, puesto2);
        
        Empresa empresa = new Empresa();
        
        //agregar
        
        if (empresa.agregar(emple1) == false) {
            System.out.println("ya existe!" + emple1.getNombreEmpleado());
        }
        else{
            empresa.agregar(emple1);
        }
        
         if (empresa.agregar(emple2) == false) {
            System.out.println("ya existe!" + emple2.getNombreEmpleado());
        }
        else{
            empresa.agregar(emple1);
        }
         
          if (empresa.agregar(emple1) == false) {
            System.out.println("ya existe!" + emple1.getNombreEmpleado());
        }
        else{
            empresa.agregar(emple1);
        }
        
      
        
        empresa.listarEmpleados();
        
    }
    
}
