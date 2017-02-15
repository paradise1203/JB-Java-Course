package org.jblab.entity.impl;

import org.jblab.entity.Instrument;
import org.springframework.stereotype.Component;

/**
 * @author Aidar Shaifutdinov.
 */
@Component
public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("Playing piano!");
    }

}
