import java.util.Scanner;
public class Hello {
    public static void main (String args[]) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa tu nombre");
        String name = leer.nextLine();
        System.out.println("Ingresa tu año de nacimiento");
        short usuario = leer.nextShort();
        int actual = 2026;
        byte edad = (byte) (actual-usuario);
        if(edad<18) {
            System.out.println("No puede entrar");
        }
        else{
            System.out.println("Bienvenide");
        }
    }
}