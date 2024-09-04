package TallerGenerics.Punto2;
import java.util.HashSet;
public class MiConjunto<T>{
    private HashSet<T> conjunto;

        public MiConjunto() {
            conjunto = new HashSet<>();
        }

        public boolean anadir(T elemento) {
            return conjunto.add(elemento);
        }

        public boolean eliminar(T elemento) {
            return conjunto.remove(elemento);
        }

        public boolean contiene(T elemento) {
            return conjunto.contains(elemento);
        }

        public int tamaño() {
            return conjunto.size();
        }

        public boolean estaVacio() {
            return conjunto.isEmpty();
        }

        public void mostrar() {
            System.out.println(conjunto);
        }

        public static void main(String[] args) {
            MiConjunto<Integer> miConjunto = new MiConjunto<>();
            miConjunto.anadir(1);
            miConjunto.anadir(2);
            miConjunto.anadir(3);

            System.out.println("Conjunto contiene 2: " + miConjunto.contiene(2));
            System.out.println("Tamaño del conjunto: " + miConjunto.tamaño());

            miConjunto.eliminar(2);
            System.out.println("Conjunto contiene 2 después de eliminar: " + miConjunto.contiene(2));
            System.out.println("Tamaño del conjunto después de eliminar: " + miConjunto.tamaño());

            miConjunto.mostrar();
        }
    }
