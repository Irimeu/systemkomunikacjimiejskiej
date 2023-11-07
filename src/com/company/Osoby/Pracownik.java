package com.company.Osoby;

public class Pracownik extends Osoba {
    private EnumKierowca kier;
    private String linia;
    private String pojazd;
    public Pracownik(String stanowisko, int wiek, String plec, EnumKierowca kier, String linia, String pojazd) {
        super(stanowisko, wiek, plec);
        this.kier = kier;
        this.linia = linia;
        this.pojazd = pojazd;
    }
}
