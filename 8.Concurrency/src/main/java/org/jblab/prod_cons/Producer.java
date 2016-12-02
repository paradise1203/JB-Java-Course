package org.jblab.prod_cons;

import java.util.Arrays;

/**
 * @author Aidar Shaifutdinov.
 */
class Producer implements Runnable {

    private final Message message;

    Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {"Hi!", "How?", "are", "you", "Bye"};
        Arrays.stream(messages).forEach(message::put);
    }

}
