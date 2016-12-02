package org.jblab.race_cond;

/**
 * @author Aidar Shaifutdinov.
 */
class Counter {

    private long count;

    synchronized void increment() {
        count++;
    }

    synchronized void decrement() {
        count--;
    }

    long getCount() {
        return count;
    }

}
