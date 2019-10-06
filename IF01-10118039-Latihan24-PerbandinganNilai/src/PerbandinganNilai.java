
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang berguna untuk membandingkan antara dua nilai  
 */
public class PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai;
        int nilai2;
        String kondisi, status;
        Scanner masuk = new Scanner(System.in);

        do {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan Nilai Pertama : ");
            nilai = masuk.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            nilai2 = masuk.nextInt();

            kondisi = (nilai > nilai2) ? "Lebih besar dari " : "Lebih kecil dari ";
            System.out.printf("Hasil %d %s %d\n", nilai, kondisi, nilai2);

            System.out.print("Ulangi Aktifitas (Ya/Tidak) : ");
            status = masuk.next();
            System.out.println("");
        } while (status.equals("Ya") || status.equals("ya"));
    }

}
