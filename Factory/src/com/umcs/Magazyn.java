package com.umcs;

import java.util.LinkedList;
import java.util.List;

public class Magazyn {
    private final List<Przedmiot> spis = new LinkedList<>();

    public void dodajDoSpisu(Przedmiot przedmiot) {
        spis.add(przedmiot);
    }



    public Double pobierzWartoscPoOpodatkowaniu(Podatek podatek) {
        double wartoscPoOpodatkowaniu = 0d;
        for (Przedmiot przedmiot : spis) { // dla każdego elementu spisu
            wartoscPoOpodatkowaniu = wartoscPoOpodatkowaniu + podatek.execute(przedmiot);
        }

        return wartoscPoOpodatkowaniu;
    }
}
