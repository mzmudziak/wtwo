package com.umcs;

public class FabrykaPOL implements AbstrakcyjnaFabrykaPodatkow{
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowy(19);
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywny(18, 32);
    }
}
