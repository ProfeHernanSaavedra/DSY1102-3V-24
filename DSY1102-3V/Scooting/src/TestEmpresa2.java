
import java.util.Scanner;

/**
 *
 * @author USRVI-LC4
 */
public class TestEmpresa2 {

    public static void main(String[] args) {
        int opc, puesto;
        String nombre, rut;
        char genero;
        int edad, añoServicio;

        Scanner leer = new Scanner(System.in);
        Empresa empresa = new Empresa();
        Puesto puesto1 = new Puesto(1, "gerente");
        Puesto puesto2 = new Puesto(2, "Ejecutivo");

        do {

            System.out.println("1.Agregar");
            System.out.println("2.Listar");
            System.out.println("3. Salir");
            opc = leer.nextInt();

            if (opc == 1) {
                System.out.println("Escoja Puesto: ");
                System.out.println("1. Gerente");
                System.out.println("2. Ejecutivo");
                puesto = leer.nextInt();

                if (puesto == 1) {
                    System.out.print("Ingrese Nombre: ");
                    nombre = leer.next();
                    System.out.print("Ingrse Rut: ");
                    rut = leer.next();
                    System.out.print("Ingrese genero: ");
                    genero = leer.next().charAt(0);
                    System.out.print("Ingrese Edad: ");
                    edad = leer.nextInt();
                    System.out.println("Ingrese Años de Servicio: ");
                    añoServicio = leer.nextInt();

                    Empleado emple = new Empleado(rut, nombre, genero, añoServicio, edad, puesto1);
                    if (empresa.agregar(emple) == false) {
                        System.out.println("ya existe!" + emple.getNombreEmpleado());
                    } else {
                        empresa.agregar(emple);
                    }
                } else {
                    if (puesto == 2) {
                        System.out.print("Ingrese Nombre: ");
                        nombre = leer.next();
                        System.out.print("Ingrse Rut: ");
                        rut = leer.next();
                        System.out.print("Ingrese genero: ");
                        genero = leer.next().charAt(0);
                        System.out.print("Ingrese Edad: ");
                        edad = leer.nextInt();
                        System.out.println("Ingrese Años de Servicio: ");
                        añoServicio = leer.nextInt();

                        Empleado emple = new Empleado(rut, nombre, genero, añoServicio, edad, puesto2);
                        if (empresa.agregar(emple) == false) {
                            System.out.println("ya existe!" + emple.getNombreEmpleado());
                        } else {
                            empresa.agregar(emple);
                        }
                    }
                }

            } else {
                if (opc == 2) {
                    empresa.listarEmpleados();
                }
            }

        } while (opc != 3);

    }

}
