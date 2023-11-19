package com.umit.entity;

public class Yilan extends Hayvan{

    boolean zehirli;

    public Yilan(String isim, int yas, boolean zehirli) {
        super(isim, yas);
        this.zehirli = zehirli;
    }

    public void sesCikar() {
        System.out.println("Yilan ses cıkariyor.");
    }

    public void bilgileriGoster() {
        System.out.println("Hayvan: " + isim + ", Yaş: " + yas +", Zehirli mi?: "+zehirli);
    }


}
