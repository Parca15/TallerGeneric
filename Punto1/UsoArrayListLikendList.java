package TallerGenerics.Punto1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsoArrayListLikendList {
    private static final int ELEMENT_COUNT = 100000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        long arrayListAccessTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        long linkedListAccessTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = ELEMENT_COUNT - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        long arrayListRemovalTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = ELEMENT_COUNT - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        long linkedListRemovalTime = endTime - startTime;

        System.out.println("ArrayList - Tiempo de inserción: " + arrayListInsertionTime + " ns");
        System.out.println("LinkedList - Tiempo de inserción: " + linkedListInsertionTime + " ns");
        System.out.println("ArrayList - Tiempo de acceso: " + arrayListAccessTime + " ns");
        System.out.println("LinkedList - Tiempo de acceso: " + linkedListAccessTime + " ns");
        System.out.println("ArrayList - Tiempo de eliminación: " + arrayListRemovalTime + " ns");
        System.out.println("LinkedList - Tiempo de eliminación: " + linkedListRemovalTime + " ns");
    }
}