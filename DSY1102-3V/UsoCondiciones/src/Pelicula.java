/**
 *
 * @author Profe Hernán
 * @version 03-09-2024
 */
public class Pelicula {
    
    private String genero,titulo;
    private int año;
    private double duracion;
    private Director director;

    public Pelicula() {
    }

    public Pelicula(String genero, String titulo, int año, double duracion, Director director) {
        this.genero = genero;
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "genero=" + genero + ", titulo=" + titulo + ", a\u00f1o=" + año + ", duracion=" + duracion + ", director=" + director + '}';
    }
    
    
    
}
