package com.umcs;

/**
 * PodatekProgresywny 18% od kwoty do 10 tys. włącznie, i 32% od kwoty powyżej 10 tys..
 */
public class PodatekProgresywny implements Podatek {
    private double podatekNiski;
    private double podatekWysoki;

    public PodatekProgresywny(double podatekNiski, double podatekWysoki) {
        this.podatekNiski = podatekNiski;
        this.podatekWysoki = podatekWysoki;
    }

    @Override
    public double execute(Przedmiot przedmiot) {
        double podatek;
        if (przedmiot.okreslWartosc() <= 10000) {
            podatek = podatekNiski / 100;
        } else {
            podatek = podatekWysoki / 100;
        }
        return przedmiot.okreslWartosc() - przedmiot.okreslWartosc() * podatek;
    }

}
