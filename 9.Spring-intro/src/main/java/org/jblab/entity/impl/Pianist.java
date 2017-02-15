package org.jblab.entity.impl;

import org.jblab.entity.Instrument;
import org.jblab.entity.Musician;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * @author Aidar Shaifutdinov.
 */
public class Pianist implements Musician {

    private final Instrument instrument;

    private final Set<String> achievements;

    @Autowired
    public Pianist(Instrument instrument, Set<String> achievements) {
        this.instrument = instrument;
        this.achievements = achievements;
    }

    @Override
    public Set<String> getAchievements() {
        return achievements;
    }

    @Override
    public void perform() {
        instrument.play();
    }

}
