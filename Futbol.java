public class Persona{
    public String name;
    public int id;
    public String nacionalidad;
    public double altura;
    public double peso;
}

public class Futbol{
    public static void main(String args[]){
        Persona p1 = new Persona();
        p1.name = "Chepe";
        p1.id = 1;
        p1.nacionalidad = "Chibcha";
        p1.altura = 1.87;
        p1.peso = 79.2;
        
        Persona p2 = new Persona();
        p2.name = "Chucho";
        p2.id = 2;
        p2.nacionalidad = "Chibcha";
        p2.altura = 1.79;
        p2.peso = 82.5;
        
        Persona p3 = new Persona();
        p3.name = "Chencho";
        p3.id = 3;
        p3.nacionalidad = "Chibcha";
        p3.altura = 1.91;
        p3.peso = 85.1;
        
        Persona p4 = new Persona();
        p4.name = "germaneselman";
        p4.id = 4;
        p4.nacionalidad = "Chibcha";
        p4.altura = 1.83;
        p4.peso = 76.8;
        
        Persona p5 = new Persona();
        p5.name = "westcol";
        p5.id = 5;
        p5.nacionalidad = "Chibcha";
        p5.altura = 1.75;
        p5.peso = 74.3;
        
        Persona p6 = new Persona();
        p6.name = "Paco";
        p6.id = 6;
        p6.nacionalidad = "Peruana";
        p6.altura = 1.89;
        p6.peso = 83.7;
        
        Persona p7 = new Persona();
        p7.name = "chimoltrufis";
        p7.id = 7;
        p7.nacionalidad = "Peruana";
        p7.altura = 1.77;
        p7.peso = 78.4;
        
        Persona p8 = new Persona();
        p8.name = "chompiras";
        p8.id = 8;
        p8.nacionalidad = "Peruana";
        p8.altura = 1.85;
        p8.peso = 80.9;
        
        Persona p9 = new Persona();
        p9.name = "Vicho";
        p9.id = 9;
        p9.nacionalidad = "Peruana";
        p9.altura = 1.90;
        p9.peso = 86.2;
        
        Persona p10 = new Persona();
        p10.name = "tuntunsajur";
        p10.id = 10;
        p10.nacionalidad = "Peruana";
        p10.altura = 1.81;
        p10.peso = 77.6;
        
        System.out.println(p1.name + " " + p1.id);
        System.out.println(p2.name + " " + p2.id);
        System.out.println(p3.name + " " + p3.id);
        System.out.println(p4.name + " " + p4.id);
        System.out.println(p5.name + " " + p5.id);
        System.out.println(p6.name + " " + p6.id);
        System.out.println(p7.name + " " + p7.id);
        System.out.println(p8.name + " " + p8.id);
        System.out.println(p9.name + " " + p9.id);
        System.out.println(p10.name + " " + p10.id);
    }
}