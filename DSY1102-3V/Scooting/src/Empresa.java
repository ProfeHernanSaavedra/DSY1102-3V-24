
import java.util.ArrayList;

/**
 *
 * @author USRVI-LC4
 */
public class Empresa {
    
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        
        listaEmpleados = new ArrayList<>();
    }
    
    //agregar
    public boolean agregar(Empleado emple)
    {
        //return listaEmpleados.add(emple);
        
        if(this.buscarEmpleado(emple.getRut())==false)
        {
            listaEmpleados.add(emple);
            return true;
        }
        return false;
    }
    
    //buscar
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado emple : listaEmpleados) {
            if (emple.getRut().equals(rut)) {
                return true;
            }
        }
        return false;
    }
    
    //listar empleados
    public void listarEmpleados()
    {
        //fore + tab
        for (Empleado emple : listaEmpleados) {
            //System.out.println(emple.toString());
            System.out.println(emple); // es lo mismo que la linea anterior porque busca automaticamente el metodo toString()
        }
    }
    
    //eliminar Empleado
    public boolean eliminarEmpleado(Empleado emple)
    {
//        for (Empleado emple : listaEmpleados) {
//            if (emple.getRut().equals(rut)) {
//                listaEmpleados.remove(emple);
//                return true;
//            }
//        }
//        return false;
        
        if (this.buscarEmpleado(emple.getRut())) {
            listaEmpleados.remove(emple);
        }
        
        return false;
    }
    
    
    
    
}
