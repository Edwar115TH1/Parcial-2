import java.util.Stack;
import java.util.Scanner;

public class Metodos {
 
    //Metodo de llenado de pila
    public Stack<ObjClase> registrarPelicula(Stack<ObjClase> pila, Scanner sc) {
        boolean continuar = true;
        while (continuar) {
            ObjClase peli = new ObjClase();
            
            System.out.print("Ingrese por favor el codigo de la pelicula: ");
            peli.setCodigo(validarEntero(sc));                   
            System.out.print("Ingrese el título de la pelicula: ");
            peli.setTitulo(sc.nextLine());           
            System.out.print("Ingrese el genero de la pelicula: ");
            peli.setGenero(sc.nextLine());
            System.out.print("¿Que duración tiene la pelicula en minutos? (Ejemplo: 120) ");
            peli.setDuracion(validarEntero(sc));            
            
            pila.push(peli);//Llevamos el Objeto a la pila
            System.out.println("¡Pelicula guardada con exito!");            
            System.out.println("\n ¿Desea continuar ingresando registros? 1|Sí - 2|No");
            int opt = validarEntero(sc);
            if (opt == 2) {
                continuar = false;
            }
        }
        return pila;
    }

    // 2. Retirar la última pelicula registrada (Pop)
    public Stack<ObjClase> retirarUltimaPeli(Stack<ObjClase> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía. No hay peliculas para retirar.");
        } else {
            ObjClase eliminado = pila.pop();
            System.out.println("Se ha retirado la ultima pelicula: " + eliminado.getTitulo());
        }
        return pila;
    }

    // 3. Consultar la ultima pelicula (Peek)
    public void consultarUltimaPelicula(Stack<ObjClase> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía. No hay ninguna pelicula registrada ¬_¬.");
        } else {
            ObjClase ultpeli = pila.peek();// Peek es para consultar, no edita, no elimina ni extrae de la pila. solo consulta O_O
            System.out.println("Última pelicula registrada:");
            // Imprimimos extrayendo atributo por atributo con Getters
            System.out.println("Codigo Pelicula: " + ultpeli.getCodigo() + " | Título: " + ultpeli.getTitulo() + " | Genero: " + ultpeli.getGenero() + " | Duración: " + ultpeli.getDuracion());
        }
    }

    // 4. Mostrar todas las peliculas
    public void mostrarTodasLasPeliculas(Stack<ObjClase> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía. No hay peliculas para mostrar X_X.");
        } else {
            System.out.println("--- PELICULAS VISTAS ---");
            // Recorremos la pila hacia atrás para respetar el orden de salida (LIFO)
            for (int i = pila.size() - 1; i >= 0; i--) {
                ObjClase ultpeli = pila.get(i);                
                System.out.println("Codigo Pelicula: " + ultpeli.getCodigo() + " | Título: " + ultpeli.getTitulo() + " | Genero: " + ultpeli.getGenero() + " | Duración: " + ultpeli.getDuracion());
            }
        }
    }

    // Método de soporte para validar enteros
    public int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("¡Error! Debe ingresar un número entero -_-.");
            System.out.print("Intente nuevamente ^_^: ");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine(); 
        return valor;
    }
}