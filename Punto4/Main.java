package TallerGenerics.Punto4;

public class Main {
    public static void main(String[] args) {
        Caja<Integer> cajaDeEnteros = new Caja<>();
        cajaDeEnteros.poner(123);
        System.out.println("Contenido de la caja: " + cajaDeEnteros.sacar());

        Caja<String> cajaDeCadenas = new Caja<>();
        cajaDeCadenas.poner("Hola");
        System.out.println("Contenido de la caja: " + cajaDeCadenas.sacar());
    }
}