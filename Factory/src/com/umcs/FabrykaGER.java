package com.umcs;

public class FabrykaGER implements AbstrakcyjnaFabrykaPodatkow{
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowy(20);
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywny(20, 40);
    }
}
