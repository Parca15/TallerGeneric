package TallerGenerics.Punto3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto:");

        String text = scanner.nextLine();
        scanner.close();

        String[] words = text.toLowerCase().split("\\W+");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}