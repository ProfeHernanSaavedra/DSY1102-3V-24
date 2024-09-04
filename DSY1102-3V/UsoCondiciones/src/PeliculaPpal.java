/**
 *
 * @author USRVI-LC2
 */
public class PeliculaPpal {
    
    public static void main(String[] args) {
        
        Director dir1 = new Director("Tarantino", "EEUU", 50, 5);
        Director dir2 = new Director("Tim Burton", "Britanico", 60, 10);
        Director dir3 = new Director("George Lucas","EEUU",70,20);
        
        Pelicula peli1 = new Pelicula("Accion", "Kill Bill", 95, 180, dir1);
        Pelicula peli2 = new Pelicula("Fantasía", "BeatleJuice", 89, 120, dir2);
        Pelicula peli3 = new Pelicula("SCI-FI", "Star Wars", 78, 120, dir3);
        
        System.out.println(peli1.toString());
        dir1.saludoDirector();
        
        peli1.getDirector().saludoDirector();
    }
    
}
