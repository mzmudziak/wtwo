package com.umcs;

public class FabrykaFRA implements AbstrakcyjnaFabrykaPodatkow{
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowy(30);
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywny(30, 50);
    }
}
