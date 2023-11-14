package com.company.Trasy;

import com.company.Osoby.Pracownik;
import com.company.Pojazdy.Pociag;
import com.company.Pojazdy.Pojazd;
import com.company.Trasy.EnumTrasa;

public class Trasa {

    private Pracownik kierujacy;
    private Pojazd pojazd;

    public Trasa(Pracownik kierujacy, Pojazd pojazd) {
        this.kierujacy = kierujacy;
        this.pojazd = pojazd;
    }
}


