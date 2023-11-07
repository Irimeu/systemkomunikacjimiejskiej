package com.company.Trasy;

import com.company.Osoby.Pracownik;
import com.company.Pojazdy.Pojazd;

public class TrasaPociag extends Trasa{
    private final EnumTrasa rodzajtrasy = EnumTrasa.pociag;
    private String miejscePoczatkowe;
    private String miejsceKoncowe;
    public TrasaPociag(Pracownik kierujacy, Pojazd pojazd) {
        super(kierujacy, pojazd);

    }
}
