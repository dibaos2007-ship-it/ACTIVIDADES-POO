import java.util.Scanner;

public class Freefire {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("QUE TAN INSANO ERES EN FREE FIRE?");
       

        int puntajeTotal = 0;

        System.out.println("Pregunta 1: Pegas muchos rojos?");
        System.out.println("Opciones: 1=Muy, 2=MAs o menos, 3=Poco, 4=Nada");
        System.out.print("Escribe tu respuesta: ");
        int resp1 = entrada.nextInt();
        if (resp1 == 1) puntajeTotal += 4;
        if (resp1 == 2) puntajeTotal += 2;
        if (resp1 == 3) puntajeTotal += 1;
        if (resp1 == 4) puntajeTotal += 0;

        System.out.println("Pregunta 2: Juegas mucho en clasificatoria Duelo de Escuadras?");
        System.out.println("Opciones: 1=Muy, 2=MAs o menos, 3=Poco, 4=Nada");
        System.out.print("Escribe tu respuesta: ");
        int resp2 = entrada.nextInt();
        if (resp2 == 1) puntajeTotal += 4;
        if (resp2 == 2) puntajeTotal += 2;
        if (resp2 == 3) puntajeTotal += 1;
        if (resp2 == 4) puntajeTotal += 0;

        System.out.println("Pregunta 3: Juegas mucho en br clasificatoria?");
        System.out.println("Opciones: 1=Muy, 2=MAs o menos, 3=Poco, 4=Nada");
        System.out.print("Escribe tu respuesta: ");
        int resp3 = entrada.nextInt();
        if (resp3 == 1) puntajeTotal += 4;
        if (resp3 == 2) puntajeTotal += 2;
        if (resp3 == 3) puntajeTotal += 1;
        if (resp3 == 4) puntajeTotal += 0;

        System.out.println("Pregunta 4: Juegas muchas salas para pvps?");
        System.out.println("Opciones: 1=Muy, 2=MAs o menos, 3=Poco, 4=Nada");
        System.out.print("Escribe tu respuesta: ");
        int resp4 = entrada.nextInt();
        if (resp4 == 1) puntajeTotal += 4;
        if (resp4 == 2) puntajeTotal += 2;
        if (resp4 == 3) puntajeTotal += 1;
        if (resp4 == 4) puntajeTotal += 0;

        System.out.println("Pregunta 5: Usas muchos skins y accesorios?");
        System.out.println("Opciones: 1=Muy, 2=MAs o menos, 3=Poco, 4=Nada");
        System.out.print("Escribe tu respuesta: ");
        int resp5 = entrada.nextInt();
        if (resp5 == 1) puntajeTotal += 4;
        if (resp5 == 2) puntajeTotal += 2;
        if (resp5 == 3) puntajeTotal += 1;
        if (resp5 == 4) puntajeTotal += 0;

        System.out.println("Pregunta 6: Conoces bien todos los mapas y puntos estrategicos?");
        System.out.println("Opciones: 1=Muy, 2=MAs o menos, 3=Poco, 4=Nada");
        System.out.print("Escribe tu respuesta: ");
        int resp6 = entrada.nextInt();
        if (resp6 == 1) puntajeTotal += 4;
        if (resp6 == 2) puntajeTotal += 2;
        if (resp6 == 3) puntajeTotal += 1;
        if (resp6 == 4) puntajeTotal += 0;

     
        System.out.println("Tu puntaje total es: " + puntajeTotal);
        if (puntajeTotal >= 19 && puntajeTotal <= 24) {
            System.out.println("el diablooo!!!!!! eres un INSANO en Free Fire!");
        }
        if (puntajeTotal >= 8 && puntajeTotal <= 18) {
            System.out.println("Eres un jugador normal de Free Fire.");
        }
        if (puntajeTotal >= 0 && puntajeTotal <= 7) {
            System.out.println("eres todo un botsito.");
        }

        entrada.close();
    }
}