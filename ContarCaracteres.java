import java.util.Scanner;
 public class ContarCaracteres {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Por favor, introduce la frase");
         String cadena = scanner.nextLine();
         int contador = 0;
         for (int i = 0; i < cadena.length(); i++) {
             contador++; 
         }
         System.out.println("La frase es  " + cadena);
         System.out.println("El numero de caracteres es: " + contador);
         scanner.close();
     }
 }