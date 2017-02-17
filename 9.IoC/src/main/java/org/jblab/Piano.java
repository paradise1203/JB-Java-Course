package org.jblab;

import org.springframework.stereotype.Component;

/**
 * @author aleksandrpliskin on 14.12.16.
 */
@Component
public class Piano implements Instrument {

    public void makeSounds() {
        System.out.println("do la do la");
    }

}