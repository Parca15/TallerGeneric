package TallerGenerics.Punto5;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elemento superior (peek): " + stack.peek());  // Debería imprimir 30

        System.out.println("Elemento eliminado (pop): " + stack.pop());  // Debería imprimir 30
        System.out.println("Elemento eliminado (pop): " + stack.pop());  // Debería imprimir 20

        System.out.println("Tamaño de la pila: " + stack.size());  // Debería imprimir 1

        System.out.println("Elemento superior (peek): " + stack.peek());  // Debería imprimir 10
    }
}