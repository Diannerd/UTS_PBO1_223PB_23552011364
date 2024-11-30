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
public class RekeningTabungan extends Rekening {

    private double bungaHarian = 0.03;

    public RekeningTabungan(String nomorRekening, String pemilik, double saldoAwal) {
        super(nomorRekening, pemilik, saldoAwal);
    }

    @Override
    public void hitungBunga() {
        double bunga = saldo * bungaHarian;
        saldo += bunga;
        System.out.println("Bunga harian ditambahkan: " + bunga);
    }
}
