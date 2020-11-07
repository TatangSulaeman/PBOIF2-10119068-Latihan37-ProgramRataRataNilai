/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.programrataratanilai.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan Rata Rata Nilai
 */
public class Main {
    public static void main(String[] args){
        Nilai dataNilai = new Nilai();
        dataNilai.inputNilai();
        dataNilai.nilaiMhs();
        
        System.out.println("");
        
        System.out.println("Maka, Rata-Rata Nilainya Adalah : " + dataNilai.rataRataNilai());
        
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
