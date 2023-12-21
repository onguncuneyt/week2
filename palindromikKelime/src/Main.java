import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str){
        boolean kontrol = true;
        for (int i = 0 ,j= str.length(); i < str.length() && j>=0; i++,j--) {

            if(str.charAt(i)==str.charAt(j-1)){
                kontrol = true;
            }else {
                return false;
            }
        }
        return kontrol;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kelimeyi girin");
        System.out.println(isPalindrome(scanner.next()) ? "Girilen kelime palindromikdir" : "Girilen kelime palindromik değildir");
    }
}