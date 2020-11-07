/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.programrataratanilai.tugas;

import java.util.Scanner;
/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan Rata Rata Nilai
 */
public class Nilai {
    Scanner keyboard = new Scanner(System.in);
    int i, j ;
    float jumlahMhs,k,rataRata;
    
    public int inputNilai(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        return j = keyboard.nextInt();
    }
    
    public int nilaiMhs(){
        jumlahMhs = 0 ;
        i = 1 ;
        while (i<=j){
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            k=keyboard.nextFloat();
            jumlahMhs += k ;
            i++;
        }
        return(int)jumlahMhs;
    }
    
    public float rataRataNilai(){
        rataRata = jumlahMhs / j;
        return rataRata;
    }
    
}
