import java.text.DecimalFormat;
import java.util.Scanner;
public class Larik1 {    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat angka = new DecimalFormat("#.#####");
        //Variable
        double batasatas, batasbawah, h, upselang, x, fx, awal, akhir, ganjil, genap, jumlah, kesimpulan;
        awal = 0;
        akhir = 0;
        ganjil = 0.0;
        genap = 0.0;
        h = 0.25;
        System.out.println("Program Kaidah 1/3 Simpson");
        System.out.print("Masukkan Batas Atas : ");
        batasatas = input.nextDouble();
        System.out.print("Masukkan Batas Bawah: ");
        batasbawah = input.nextDouble();
        x = batasbawah;
        System.out.println("Selang [" + (int) batasbawah + "," + (int) batasatas + "]");
        upselang = (batasatas - batasbawah) / h;
        for (int j = 0; j <= upselang; j++) {
            System.out.println("r : " + j);
            System.out.println("x : " + angka.format(x));
            fx = 1 / (1 + x);
            System.out.println("fx: " + angka.format(fx));
            System.out.println("====================================");
            if (j == 0) {
                awal = fx;
                //System.out.println("awal "+awal);
            } else if (j == 8) {
                akhir = fx;
                //  System.out.println("Akhir "+akhir);
            } else if (j % 2 == 1) { //1, 3, 5, 7
                //System.out.println("Ganjil ");
                ganjil = ganjil + (4 * fx);
            } else if (j % 2 == 0) { //2, 4, 6
                //System.out.println("Genap ");
                genap = genap + (2 * fx);
            }
            x += h;
        }
        System.out.println("=================Hasil Akhir=============");
        /*System.out.println("Awal : " + awal);
        System.out.println("Genap : " + genap);
        System.out.println("Ganjil : " + ganjil);
        System.out.println("Akhir : " + akhir);*/
        jumlah = awal + genap + ganjil + akhir;
        System.out.println("Jumlah : " + angka.format(jumlah));
        kesimpulan = h / 3 * jumlah;
        System.out.println("Hasil Akhir : " + angka.format(kesimpulan));
    }
}





    
   