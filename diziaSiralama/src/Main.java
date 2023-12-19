import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Gireceğiniz eleman sayısını girin : ");
        n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ".sayiyi girin : ");

            nums[i]=scanner.nextInt();

        }

        Arrays.sort(nums);

        for(int var : nums){
            System.out.println(var);
        }

    }
}