public class Main {
    public static void main(String[] args) {
        int[][] matris= {{2,3,4},{5,6,4}};
        int[][] transpoze = new int[matris.length+1][matris[0].length-1];

        for (int i = 0; i <matris[0].length ; i++) {
            for (int j = 0; j < matris.length; j++) {
                transpoze[i][j]=  matris[j][i];
            }
        }

        System.out.println("Matris : ");
        for(int[] row : matris){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspoze : ");
        for(int[] row : transpoze){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


}