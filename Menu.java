import java.util.Stack;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        
        // Creamos el objeto pila aquí para manejarlo dinámicamente
        Stack<ObjClase> pila = new Stack<>();
        int opcion = 0;

        do {
            System.out.println("\n--------------- MENU DE OPCIONES ---------------");
            System.out.println("1| Registrar una película vista ");
            System.out.println("2| Eliminar la última película registrada (pop)");
            System.out.println("3| Consultar la última película vista (peek)");
            System.out.println("4| Mostrar el historial completo");
            System.out.println("5| Salir");
            System.out.print("Por favor, elija una opción: ");

            opcion = m.validarEntero(sc);

            switch (opcion) {
                case 1:
                    // Enviamos la pila, el scanner y la reasignamos con los cambios
                    pila = m.registrarPelicula(pila, sc);
                    break;

                case 2:
                    pila = m.retirarUltimaPeli(pila);
                    break;

                case 3:
                    m.consultarUltimaPelicula(pila);
                    break;

                case 4:
                    m.mostrarTodasLasPeliculas(pila);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese un número del 1 al 5.");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}