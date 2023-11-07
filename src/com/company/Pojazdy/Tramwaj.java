package com.company.Pojazdy;

public class Tramwaj extends Pojazd{
    private int iloscPrzedzialow;

    public Tramwaj(String nazwa, int rokWydania, String marka, int iloscmiejsc, int iloscPrzedzialow) {
        super(nazwa, rokWydania, marka, iloscmiejsc);
        this.iloscPrzedzialow = iloscPrzedzialow;
    }
}
