/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan21;

import java.util.Scanner;
/**
 *
 * @author USER
 * NAMA: Devyana Risky Putri Andini
 * MATA KULIAH: PBO1
 * NIM: 23176023
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * 
 */
//program rata-rata nilai
public class Latihan21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }
        
        double rataRata = (double) totalNilai / jumlahMahasiswa;
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");
        
        input.close();
    }
}
