package org.jblab.prod_cons;

/**
 * @author Aidar Shaifutdinov.
 */
class Message {

    private String message;

    private boolean empty = true;

    synchronized void put(String message) {
        while (!empty) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }
        this.message = message;
        empty = false;
        notify();
    }

    synchronized String get() {
        while (empty) {
            try {
                wait();
            } catch (Exception ignored){
            }
        }
        empty = true;
        notify();
        return message;
    }

}
