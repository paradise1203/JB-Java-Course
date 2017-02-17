package org.jblab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author aleksandrpliskin on 14.12.16.
 */
public class Player {

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    public Player() {

    }

    public Player(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play() {
        instrument.makeSounds();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

}
