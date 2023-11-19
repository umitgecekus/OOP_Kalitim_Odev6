package com.umit.entity;

public class Kus extends Hayvan{

    String tuyRengi;

    public Kus(String isim, int yas, String tuyRengi) {
        super(isim, yas);
        this.tuyRengi = tuyRengi;
    }

    public void sesCikar() {
        System.out.println("Kus ses çıkarıyor.");
    }

    public void bilgileriGoster() {
        System.out.println("Hayvan: " + isim + ", Yaş: " + yas +", Tuy Rengi: "+tuyRengi);
    }

}
