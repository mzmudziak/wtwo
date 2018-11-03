package com.umcs;

public class Rzezba implements Przedmiot {
    private final Integer rokWykonania;
    private final Double rozmiarRzezby;

    public Rzezba(Integer rokWykonania, Double rozmiarRzezby) {
        this.rokWykonania = rokWykonania;
        this.rozmiarRzezby = rozmiarRzezby;
    }

    /**
     * wartość Rzeźb to 2020 minus rok wykonania, pomnożone przez rozmiar rzeźby w metrach sześciennych, pomnożone razy 2.
     *
     * @return
     */
    @Override
    public Double okreslWartosc() {
        return (2020 - rokWykonania) * rozmiarRzezby * 2;
    }

}
