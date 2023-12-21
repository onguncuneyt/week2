import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        int kalanHak = 5;

        System.out.println("Sayıyı tahmin et");

        while (kalanHak > 0){
            int tahmin = scanner.nextInt();

            if(tahmin == number){
                System.out.print("Tebrikler kazandınız");
                break;
            }else {
                kalanHak--;
                System.out.print("Üzgünüm doğru tahmin edemediniz. Kalan hakkınız : " + kalanHak + "\n");


            }
        }

    }
}