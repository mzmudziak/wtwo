package com.umcs;

import java.io.IOException;

public class OggBuilder implements Builder {
    private String naglowek;
    private String tag;
    private String body;

    public File build() {
        return new File(naglowek, tag, body);
    }

    public OggBuilder budujNaglowek() {
        this.naglowek = "OggHeader";
        return this;
    }

    public OggBuilder budujTagi() {
        this.tag = "OggTags";
        return this;
    }

    /**
     * tab[x] > 100 to tab[x] = 100 i tab[x] < -100 to tab[x] = -100,
     *
     * @param tab
     * @return
     */
    public OggBuilder budujBody(int[] tab) throws IOException {
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 100) {
                tab[i] = 100;
            } else if(tab[i] < -100) {
                tab[i] = -100;
            }
        }
        this.body = Base64EncodedZip.encode(tab);
        return this;
    }
}
