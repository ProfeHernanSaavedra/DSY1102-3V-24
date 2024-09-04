/**
 *
 * @author ProfeHernan
 * @version 03-09-2024
 */
public class Director {
    
    private String nombre,nacionalidad;
    private int edad,cantProyectos;

    public Director() {
    }

    public Director(String nombre, String nacionalidad, int edad, int cantProyectos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.cantProyectos = cantProyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantProyectos() {
        return cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", cantProyectos=" + cantProyectos + '}';
    }

    public void saludoDirector()
    {
        System.out.println("Hola a todos mis seguidores!!! les habla " + this.getNombre());
    }
    
    
    
       
    
    
}
