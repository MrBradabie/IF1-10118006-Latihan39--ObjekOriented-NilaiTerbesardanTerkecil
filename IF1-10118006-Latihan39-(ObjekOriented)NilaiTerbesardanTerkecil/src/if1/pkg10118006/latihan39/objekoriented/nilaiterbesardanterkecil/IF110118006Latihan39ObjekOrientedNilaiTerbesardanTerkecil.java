
package if1.pkg10118006.latihan39.objekoriented.nilaiterbesardanterkecil;

import java.util.Scanner;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class IF110118006Latihan39ObjekOrientedNilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        Scanner scn = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = scn.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);

    }
    
}
