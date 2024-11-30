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
public class Transaksi {

    private String tanggal;
    private double nominal;
    private String jenisTransaksi;

    public Transaksi(String tanggal, double nominal, String jenisTransaksi) {
        this.tanggal = tanggal;
        this.nominal = nominal;
        this.jenisTransaksi = jenisTransaksi;
    }

    public void cetakTransaksi() {
        System.out.println("Tanggal: " + tanggal + ", Nominal: " + nominal + ", Jenis: " + jenisTransaksi);
    }
}
