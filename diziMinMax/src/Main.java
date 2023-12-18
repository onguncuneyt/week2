import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    public static void main(String[] args) {

        //scanner class init
        Scanner scanner = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        //get data from user
        System.out.print("Sayı girin : ");
        int num = scanner.nextInt();

        //add element to list which user entered
        list = addElement(list,num);
        //sort list
        Arrays.sort(list);

        //find indexOf entered num with binarySearch
        int indexOfNum = Arrays.binarySearch(list, num);


        System.out.println("En Yakın Minimum Değer " + list[indexOfNum-1]);
        System.out.println("En Yakın Maximum Değer " + list[indexOfNum+1]);

    }
}