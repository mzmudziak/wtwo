package com.umcs.przedmiot;

public class Ksiazka implements Przedmiot {
    private final int numerWydania;
    private final int rokWydania;

    public Ksiazka(int rokWydania, int numerWydania) {
        this.rokWydania = rokWydania;
        this.numerWydania = numerWydania;
    }

    @Override
    public double okreslWartosc() {
        return (2050.0 - rokWydania) / numerWydania;
    }
}

