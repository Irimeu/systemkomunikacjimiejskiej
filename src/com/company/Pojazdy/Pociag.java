package com.company.Pojazdy;

public class Pociag extends Pojazd{
    private int liczbaWagonow;

    public Pociag(String nazwa, int rokWydania, String marka, int iloscmiejsc, int liczbaWagonow) {
        super(nazwa, rokWydania, marka, iloscmiejsc);
        this.liczbaWagonow = liczbaWagonow;
    }
}
