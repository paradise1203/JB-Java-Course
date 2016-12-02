package org.jblab.race_cond;

/**
 * @author Aidar Shaifutdinov.
 */
public class Main {

    private final static Counter counter = new Counter();

    public static void main(String[] args) {
        new Thread(counter::increment).start();
        new Thread(counter::decrement).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println(counter.getCount());
    }

}
