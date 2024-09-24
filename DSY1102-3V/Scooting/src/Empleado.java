
/**
 *
 * @author USRVI-LC4
 */
public class Empleado {
    
   private String rut,nombreEmpleado;
   private char genero; // 'm' o 'f' 0 'o'
   private int añoServicios,edad;
   private Puesto puesto;

    public Empleado() {
        this.puesto = new Puesto();
    }

    public Empleado(String rut, String nombreEmpleado, char genero, int añoServicios, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreEmpleado = nombreEmpleado;
        this.genero = genero;
        this.añoServicios = añoServicios;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAñoServicios() {
        return añoServicios;
    }

    public void setAñoServicios(int añoServicios) {
        this.añoServicios = añoServicios;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombreEmpleado=" + nombreEmpleado + ", genero=" + genero + ", a\u00f1oServicios=" + añoServicios + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
   
   
    
}
