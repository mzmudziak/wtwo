package com.umcs;

public class PodatekLiniowy implements Podatek {
    private double podatek;

    public PodatekLiniowy(double podatek) {
        this.podatek = podatek;
    }

    /**
     * Mająć przedmiot, podaj wartość przedmiotu po opodatkowaniu
     *
     * @param przedmiot
     * @return wartość przedmiotu po opodatkowaniu
     */
    @Override
    public double execute(Przedmiot przedmiot) {
        return przedmiot.okreslWartosc() - przedmiot.okreslWartosc() * podatek / 100;
    }
}
