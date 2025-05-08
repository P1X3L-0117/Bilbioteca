
package biblioteca;

import java.util.Scanner;


public  class Libro {
   //Atributos
           
    
    public static void RegistrarLibro(){
         String Titulo;
         
          
         Scanner sc = new Scanner(System.in);
         
            int Drama;
            int Terror;
            int SCFI;
            
           System.out.println("Bienvenido " + Nombre);
           
           System.out.println("Titulo del libro");  
           Titulo = sc.nextLine();
           
           System.out.println("El libro  " + Titulo);
            
           System.out.println("a que genero pertenece");
           
           System.out.println("Genero del libro"); 
           
           System.out.println("1.Drama");  
           
           System.out.println("2.Terror");  
           
           System.out.println("3.SCFI");  
            
           int Genero= sc.nextInt();
           
           switch (Genero) {
                case 1 ->
                    Drama=+1;
                case 2 ->
                    Terror=+1;
                case 3 -> {
                    SCFI=+1;
                }
                default ->
                    System.out.println("Opción inválida.");
            }
          

    }}

                    
            
   
    
                     
    
    
     
         
            
    
 

