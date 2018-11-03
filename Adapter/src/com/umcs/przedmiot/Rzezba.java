package com.umcs.przedmiot;

public class Rzezba implements Przedmiot {
    private final int rokWykonania;
    private final double rozmiar;

    public Rzezba(int rokWykonania, double rozmiar) {
        this.rokWykonania = rokWykonania;
        this.rozmiar = rozmiar;
    }

    @Override
    public double okreslWartosc() {
        return (2020 - rokWykonania) * rozmiar * 2;
    }

}
