/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author asus
 */

import java.util.Scanner;

public class TUGAS1 {
    public static void main(String[] args) {
        double pemasukkan, bonus, gaji, pengeluaran, tabungan;
        int jam, lembur, totalKerja;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Gaji: Rp. ");
        gaji = in.nextDouble();
        System.out.print("Total Jam Kerja perMinggu: ");
        totalKerja = in.nextInt();
        lembur = totalKerja - 40;
        System.out.println("Total Hari lembur: " + lembur + " hari");
        bonus = lembur*(1.5*gaji);
        pemasukkan = (gaji*40) + bonus;
        
        
        System.out.println("Pemasukkan selama seminggu = Rp. " + pemasukkan);
        System.out.print("Pengeluaran: Rp. ");
        pengeluaran = in.nextInt();
        tabungan = pemasukkan - pengeluaran;
        
        if(pemasukkan > pengeluaran){
            System.out.println("Bisa Menabung");
            System.out.println("Besar tabungan perMinggu = Rp. " + tabungan);
        }else if(pemasukkan == pengeluaran){
            System.out.println("Tidak Bisa Menabung");
        }else if (pemasukkan < pengeluaran){
            System.out.println("Cari Tambahan");
        }
        
        
    }
}
