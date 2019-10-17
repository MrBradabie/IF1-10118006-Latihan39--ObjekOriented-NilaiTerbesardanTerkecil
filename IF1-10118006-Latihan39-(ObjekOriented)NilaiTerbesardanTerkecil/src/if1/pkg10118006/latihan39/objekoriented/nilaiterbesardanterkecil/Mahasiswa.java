
package if1.pkg10118006.latihan39.objekoriented.nilaiterbesardanterkecil;

import java.util.Scanner;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class Mahasiswa {
    public int nilai[] = new int [100];

    
    public int inputNilai(int parNilai[], int parBykMhs){
     Scanner scn = new Scanner(System.in);

     for (int no=1; no<=parBykMhs; no++){
         System.out.print("Nilai Mahasiswa ke-"+no+" : ");
         parNilai[no] = scn.nextInt();
     }
     return 0;
    }
    
        public int hitungMax(int parNilai[], int parBykMhs){
        int max = 0;
        for (int no=1; no<=parBykMhs; no++)        
        if (parNilai[no] > max) {
            max = parNilai[no];
            }
            return max;
    }
        public int hitungMin(int parNilai[], int parBykMhs){            
        int min = 1000;
        for (int no=1; no<=parBykMhs; no++)
            if (parNilai[no] < min){
                min = parNilai[no];
            }
            return min;
        }
    
    public void tampilBesarKecil(int parNilai[], int parBykMhs){
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int no=1; no<=parBykMhs; no++){
         System.out.println("Nilai Mahasiswa ke-"+no+" : " + parNilai[no]);
        }
        System.out.println("\n"+"Nilai Terbesar : "+ hitungMax(parNilai, parBykMhs));
        System.out.println("Nilai Terkecil : "+ hitungMin(parNilai, parBykMhs));
        
        
    }
    
}
