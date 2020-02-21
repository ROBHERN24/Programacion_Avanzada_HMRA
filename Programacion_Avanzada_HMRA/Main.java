import Entidades.Persona;

public class Main {

    public static void main(String[] args) {
        int x =76;
        char c= 64;
        System.out.println();
        //ejecutar el metodo constructor
        Persona beto = new Persona(27, 180, 63.49);
        Persona martha = new Persona(0,0,0);
        System.out.println();
        beto.edad = 18;
        System.out.println();
    }

}