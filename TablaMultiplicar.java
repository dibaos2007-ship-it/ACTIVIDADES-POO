import java.util.Scanner;
public class TablaMultiplicar {
     public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Hola en Java desde consola");
         System.out.println("Ingresa tu nombre: ");
         String nombre = sc.nextLine();
         System.out.println("Ingresa un numero: ");
         int n = sc.nextInt();
         System.out.println("Hola " + nombre + ",esta es la tabla del " + n + ":\n");
         for(int i = 1; i <=10; i++){
             System.out.println(n + "x" + i + " = " + (n * i));
         }
         sc.close();
     }
 }