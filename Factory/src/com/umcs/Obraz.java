package com.umcs;

public class Obraz implements Przedmiot {
    private final Integer rokNamalowania;

    public Obraz(Integer rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    @Override
    public Double okreslWartosc() {
        return (2100d - rokNamalowania) * 10;
    }
}


