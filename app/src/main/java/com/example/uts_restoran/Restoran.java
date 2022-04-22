package com.example.uts_restoran;

public class Restoran {

    String nama, jarak, biaya, jumlahVoter, rating;
    int fotoMakanan;

    // misalnya ada 10 orang yang nilai bintang 5
    /*int rating_default = 5;
    int jumlahVoter_Default = 10;*/

    public Restoran(String nama, String jarak, String biaya, String jumlahVoter, String rating, int fotoMakanan) {
        this.nama = nama;
        this.jarak = jarak;
        this.biaya = biaya;
        this.jumlahVoter = jumlahVoter;
        this.rating = rating;
        this.fotoMakanan = fotoMakanan;
    }

    public String getNama() {
        return nama;
    }

    public String getJarak() {
        return jarak;
    }

    public String getBiaya() {
        return biaya;
    }

    public String getJumlahVoter() {
        return jumlahVoter;
    }

    public String getRating() {

        //rating = ((jumlahVoter_Default * rating_default) + (jumlahVoter * rating)) / jumlahVoter_Default + jumlahVoter;
        return rating;
    }

    public int getFotoMakanan() {
        return fotoMakanan;
    }
}
