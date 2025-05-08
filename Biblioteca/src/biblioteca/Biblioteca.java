
package biblioteca;
import java.util.Scanner;



public class Biblioteca {


    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Eliga de las siguientes opciones");
    
    System.out.println("\n--- Simulador de Biblioteca ---");
    
            System.out.println("1. Registrar usuario nuevo");
            
            System.out.println("2. Registrar libro nuevo");
            
            System.out.println("3. Inventario");
            
            System.out.print("Seleccione una opción: ");
            
            int opcion = sc.nextInt();

                switch (opcion) {
                case 1 -> Usuarios.RegistrarUsuario();
                    case 2 -> {
                        Libro.RegistrarLibro();
                }
                case 3 -> {
                    Inventario.Inventariolista();
                            
                    return;
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    

