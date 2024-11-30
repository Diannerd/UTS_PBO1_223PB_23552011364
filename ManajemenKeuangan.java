/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_PBO;

/**
 *
 * @author Anne
 */
public class ManajemenKeuangan {

    public static void main(String[] args) {
        RekeningTabungan tabungan = new RekeningTabungan("123456", "Dianne", 500000);
        RekeningGiro giro = new RekeningGiro("789012", "Dianne", 1000000);

        System.out.println("=== Tabungan ===");
        tabungan.setor(200000);
        tabungan.hitungBunga();
        tabungan.cetakSaldo();

        System.out.println("\n=== Giro ===");
        giro.tarik(50000);
        giro.hitungBunga();
        giro.cetakSaldo();

        System.out.println("\n=== Transaksi ===");
        Transaksi transaksi1 = new Transaksi("2024-11-26", 200000, "Setoran");
        transaksi1.cetakTransaksi();
    }
}
