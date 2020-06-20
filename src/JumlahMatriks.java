import java.util.Scanner;
public class JumlahMatriks {
        Scanner masuk = new Scanner (System.in);
      public void masukData (int data [][]){
          for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){
                    System.out.print("("+(i+j)+","+(j+1)+")"+":");
                    data [i][j] = masuk.nextInt();
                }
              
          }
    }
    public int [][] tambah (int AA[][], int BB[][]){
        int hasil [][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil [i][j] = AA [i][j] + BB[i][j];
            }}
        return hasil;
    }
    public void tampilData (int data [][], char nama){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nama +"["+(i+1)+"] ["+ (j+1) +"] ="+data[i][j]+" ");
                
            }
            System.out.println();
        }
        }
    public static void main(String[] args) {
        int A[][]= new int [3][3];
        int B[][]= new int [3][3];
        int C[][]= new int [3][3];
        
        JumlahMatriks jumlah = new JumlahMatriks();
        System.out.println("Masukkan data Matriks A");
        jumlah.masukData(A);
        System.out.println("Masukkan Data Matriks B");
        jumlah.masukData(B);
        C = jumlah.tambah(A, B);
        jumlah.tampilData(C, 'C');


    }
}
   
