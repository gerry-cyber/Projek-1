public class ArrayDuaDimensi {
 public static void main(String[] args) {
        int[][] matriks = new int [2][3];
        matriks [0][0] = 50;
        matriks [0][1] = 38;
        matriks [0][2] = 95;
        matriks [1][0] = 43;
        matriks [1][1] = 85;
        matriks [1][2] = 15;
        int i,j;
        for (i = 0; i < 2 ; i++) {
             for (j = 0; j < 3 ; j++)
                 System.out.print(matriks [i][j] +" ");
           // System.out.println("");
            
        }
    }
}
   

