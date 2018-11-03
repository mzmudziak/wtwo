package com.umcs.przedmiot;

public class Obraz implements Przedmiot {
    private final int rokNamalowania;

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    @Override
    public double okreslWartosc() {
        return (2100d - rokNamalowania) * 10;
    }
}
