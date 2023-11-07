package com.company.Trasy;

import com.company.Osoby.Pracownik;
import com.company.Pojazdy.Pojazd;

public class TrasaTramwaj extends Trasa{
    private final EnumTrasa rodzajtrasy = EnumTrasa.tramwaj;
    private String miejscePoczatkowe;
    private String miejsceKoncowe;
    public TrasaTramwaj(Pracownik kierujacy, Pojazd pojazd) {
        super(kierujacy, pojazd);

    }
}
