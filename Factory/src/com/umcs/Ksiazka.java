package com.umcs;

public class Ksiazka implements Przedmiot {
    private final Integer nrWydania;
    private final Integer rokWydania;

    public Ksiazka(Integer rokWydania, Integer nrWydania) {
        this.rokWydania = rokWydania;
        this.nrWydania = nrWydania;
    }

    /**
     * Wartość Książek to 2050 minus rok wydania, podzielone przez numer wydania książki.
     *
     * @return wartość książki
     */
    @Override
    public Double okreslWartosc() {
        return (2050d - rokWydania) / nrWydania;
    }
}




