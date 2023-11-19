package com.umit.entity;

public class Kedi extends Hayvan{
    String tuyRengi;

    public Kedi(String isim, int yas, String tuyRengi) {
        super(isim, yas);
        this.tuyRengi = tuyRengi;
    }

    public void sesCikar() {
        System.out.println("Kedi ses çıkarıyor.");
    }
    public void bilgileriGoster() {
        System.out.println("Hayvan: " + isim + ", Yaş: " + yas +", Tuy Rengi: "+tuyRengi);
    }


}
