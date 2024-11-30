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
public abstract class Rekening implements LayananKeuangan {

    private String nomorRekening;
    private String pemilik;
    protected double saldo;

    public Rekening(String nomorRekening, String pemilik, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.saldo = saldoAwal;
    }

    public abstract void hitungBunga();

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    @Override
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil setor: " + jumlah);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0.");
        }
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik: " + jumlah);
        } else {
            System.out.println("Penarikan gagal. Periksa saldo Anda.");
        }
    }

    @Override
    public void cetakSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
