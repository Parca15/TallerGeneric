package TallerGenerics.Punto4;

public class Caja<T>{
    private T contenido;

    public void poner(T contenido) {
        this.contenido = contenido;
    }

    public T sacar() {
        return contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }
}

