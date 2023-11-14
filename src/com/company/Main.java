package com.company;

import com.company.Osoby.EnumKierowca;
import com.company.Osoby.Pracownik;
import com.company.Pojazdy.Autobus;
import com.company.Pojazdy.Pociag;
import com.company.Pojazdy.Tramwaj;
import com.company.Trasy.Trasa;

public class Main {

    public static void main(String[] args) {
        Autobus autobus1 = new Autobus("muciekmaly", 2003, "Scania", 33, "bus");
        Autobus autobus2 = new Autobus("muciekduzy", 2007, "Scania", 33, "autobus");
        Pociag pociag1 = new Pociag("Porta Moravica", 2012, "Newag", 402, 4);
        Pociag pociag2 = new Pociag("IC 46100", 2012, "Siemens", 502, 5);
        Tramwaj tramwaj1 = new Tramwaj("Tramwaj1", 2001, "Newag", 76, 3);
        Tramwaj tramwaj2 = new Tramwaj("Tramwaj2", 2001, "Newag", 93, 4);

        Pracownik kierowca1 = new Pracownik("Marek", "Kierowca", 42, "Mezczyzna", EnumKierowca.autobus);
        Pracownik kierowca2 = new Pracownik("Tomek", "Kierowca", 36, "Mezczyzna", EnumKierowca.autobus);
        Pracownik kierowca3 = new Pracownik("Darek", "Kierowca", 35, "Mezczyzna", EnumKierowca.pociag);
        Pracownik kierowca4 = new Pracownik("Arek", "Kierowca", 47, "Mezczyzna", EnumKierowca.tramwaj);

        Trasa TrasaAutobus = new Trasa(kierowca1,autobus2);
        Trasa TrasaBus = new Trasa(kierowca2,autobus1);
        Trasa TrasaPociag = new Trasa(kierowca3,pociag2);
        Trasa TrasaTramwaj = new Trasa(kierowca4,tramwaj1);

    }
}
