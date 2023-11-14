package com.company.Osoby;

public class Pracownik extends Osoba {
    private EnumKierowca kier;
    public Pracownik(String imie, String stanowisko, int wiek, String plec, EnumKierowca kier) {
        super(imie, stanowisko, wiek, plec);
        this.kier = kier;

    }
}
