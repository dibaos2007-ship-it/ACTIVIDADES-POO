import java.util.Scanner;

public class Funcion {
  public static int sumar(int a, int b){
    return a+b;}
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
    int resul=sumar(10,1);
        System.out.println(resul);
        System.out.println(sumar(15,3));
}
}