package com.umit;

import com.umit.entity.Balik;
import com.umit.entity.Kedi;
import com.umit.entity.Kus;
import com.umit.entity.Yilan;

public class Runner {
    public static void main(String[] args) {
        Kedi kedi= new Kedi("Boncuk",5,"siyah");
        Balik balik= new Balik("Nemo",2,"Amphiprioninae");
        Kus kus = new Kus("hero",2,"siyah");
        Yilan yilan= new Yilan("Kobra",3,true);
        System.out.println("------------------------------");

        kedi.bilgileriGoster();
        kedi.sesCikar();

        System.out.println();

        balik.bilgileriGoster();
        balik.sesCikar();
        System.out.println();
        kus.bilgileriGoster();
        kus.sesCikar();
        System.out.println();
        yilan.bilgileriGoster();
        yilan.sesCikar();




    }   //main method sonu
}   //class sonu
