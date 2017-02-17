package org.jblab;

/**
 * @author aleksandrpliskin on 14.12.16.
 */
public class Container {

    private Player guitarPlayer;
    private Player pianoPlayer;

    private Instrument piano;
    private Instrument guitar;

    public void init() {

        piano = new Piano();
        guitar = new Guitar();

        guitarPlayer = new Player(guitar);
        pianoPlayer = new Player(piano);

    }

    public Player getGuitarPlayer() {
        return guitarPlayer;
    }

    public Player getPianoPlayer() {
        return pianoPlayer;
    }

    public Instrument getPiano() {
        return piano;
    }

    public Instrument getGuitar() {
        return guitar;
    }
}
