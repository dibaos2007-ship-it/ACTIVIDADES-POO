import java.time.LocalDate;
import java.util.Scanner;

public class JugadoresDorsal {
    public String name;
    public int id;
    public String nacionalidad;
    public String posicion;
    public String dorsal;
    public double altura;
    public double peso;
    public LocalDate nacimiento;

    public String mostrarDatos() {
        return "Nombre: " + name + "ID: " + id + "Nacionalidad: " + nacionalidad + "Dorsal: " + dorsal + "Altura: " + altura + "Peso: " + peso + "Nacimiento: " + nacimiento;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        JugadoresDorsal jugador = new JugadoresDorsal();

        System.out.println("Ingresa el nombre del jugador:");
        jugador.name = leer.nextLine();

        System.out.println("Ingresa el ID del jugador:");
        jugador.id = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingresa la nacionalidad:");
        jugador.nacionalidad = leer.nextLine();

        System.out.println("Ingresa la posicion");
        jugador.posicion = leer.nextLine();

        System.out.println("Ingresa el numero dorsal:");
        jugador.dorsal = leer.nextLine();

        System.out.println("Ingresa la altura:");
        jugador.altura = leer.nextDouble();

        System.out.println("Ingresa el peso:");
        jugador.peso = leer.nextDouble();
        leer.nextLine();

        System.out.println("Ingresa el año de nacimiento:");
        int año = leer.nextInt();
        System.out.println("Ingresa el mes de nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingresa el dia de nacimiento:");
        int dia = leer.nextInt();
        jugador.nacimiento = LocalDate.of(año, mes, dia);

        System.out.println("datos del deportista");
        System.out.println(jugador.mostrarDatos());

        leer.close();
    }
}