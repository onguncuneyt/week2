public class Main {
    public static void main(String[] args) {

        String[][] desen = new String[7][4];

        for (int i = 0; i < desen.length; i++) {
            for (int j = 0; j < desen[i].length; j++) {
                if(i==0||i==6||i==3){
                    desen[i][j]="* ";
                } else if (j==0 || j==3) {
                    desen[i][j]="* ";
                }else {
                    desen[i][j]="  ";
                }
            }
        }

        for(String[] row : desen){
            for (String col :row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}