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
public class RekeningGiro extends Rekening {

    private double bungaBulanan = 0.01;

    public RekeningGiro(String nomorRekening, String pemilik, double saldoAwal) {
        super(nomorRekening, pemilik, saldoAwal);
    }

    @Override
    public void hitungBunga() {
        double bunga = saldo * bungaBulanan;
        saldo += bunga;
        System.out.println("Bunga bulanan ditambahkan: " + bunga);
    }
}
