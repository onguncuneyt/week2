public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9};
        double harmonikOrt,harmonikSeri = 0;

        for(int i : numbers){
            harmonikSeri += (double) 1/i;
        }

        harmonikOrt= numbers.length / harmonikSeri;

        System.out.println("Harmonik Ortalama = " + harmonikOrt);

    }
}