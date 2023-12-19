import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,910,21,1,33,9,1};

        Map<Integer, Integer> tekrarlar = new HashMap<>();

        // Dizideki her bir elemanın tekrar sayısını bulma
        for (int num : list) {
            if (tekrarlar.containsKey(num)) {
                // Eğer num zaten haritada varsa, değerini bir arttır
                tekrarlar.put(num, tekrarlar.get(num) + 1);
            } else {
                // Eğer num haritada yoksa, yeni bir giriş oluştur ve 1 olarak ata
                tekrarlar.put(num, 1);
            }
        }

        // Tekrar eden sayıları ekrana yazdırma
        System.out.println("Dizideki tekrar eden sayılar:");
        for (Map.Entry<Integer, Integer> entry : tekrarlar.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " kez tekrar ediyor.");
            }
        }
    }
}