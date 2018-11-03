package com.umcs;

import com.umcs.podatek.Podatek;
import com.umcs.przedmiot.Przedmiot;

import java.util.LinkedList;
import java.util.List;

public class Magazyn {
    private final List<Przedmiot> przedmioty = new LinkedList<>();

    public void dodajDoSpisu(Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }

    public Double pobierzWartoscPoOpodatkowaniu(Podatek podatek) {
        double wartoscPoOpodatkowaniu = 0d;
        for (Przedmiot przedmiot : przedmioty) {
            wartoscPoOpodatkowaniu = wartoscPoOpodatkowaniu + podatek.pobierz(przedmiot);
        }

        return wartoscPoOpodatkowaniu;
    }
}
