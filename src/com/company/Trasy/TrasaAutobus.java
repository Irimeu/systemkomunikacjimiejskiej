package com.company.Trasy;

import com.company.Osoby.Pracownik;
import com.company.Pojazdy.Pojazd;

public class TrasaAutobus extends Trasa{
    private final EnumTrasa rodzajtrasy = EnumTrasa.autobus;
    private String miejscePoczatkowe;
    private String miejsceKoncowe;
    public TrasaAutobus(Pracownik kierujacy, Pojazd pojazd) {
        super(kierujacy, pojazd);
    }
}
