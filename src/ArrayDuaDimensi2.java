import java.util.Scanner;
public class ArrayDuaDimensi2 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int nilai [][] = new int [2][3];
        System.err.println("Masukkan data nilia");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print("("+(i+1)+" , "+(j+1)+")"+ " : ");
                nilai [i][j]= masuk.nextInt();
            }
            
        }
        System.out.println("Data nilai yang di,masukkan ");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++)
                System.out.print(nilai [i][j]+" ");
            System.out.println();}
    }
}

