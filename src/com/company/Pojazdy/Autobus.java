package com.company.Pojazdy;

public class Autobus extends Pojazd{
    private String wielkosc;

    public Autobus(String nazwa, int rokWydania, String marka, int iloscmiejsc, String wielkosc) {
        super(nazwa, rokWydania, marka, iloscmiejsc);
        this.wielkosc = wielkosc;
    }
}
