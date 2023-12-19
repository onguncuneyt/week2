import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> tekrarlar = new HashMap<>();

        // Dizideki her bir elemanın tekrar sayısını bulma
        for (int num : list) {

            if (tekrarlar.containsKey(num)) {
                // Eğer num zaten haritada varsa, değerini bir arttır
                tekrarlar.put(num, tekrarlar.get(num) + 1);
            } else {

                tekrarlar.put(num, 1);
            }
        }


        System.out.println("Dizideki tekrar eden sayılar:");
        for (Map.Entry<Integer, Integer> entry : tekrarlar.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue() + " kez tekrar ediyor.");

        }
    }
}