package org.jblab.prod_cons;

/**
 * @author Aidar Shaifutdinov.
 */
class Consumer implements Runnable {

    private final Message message;

    Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String m = message.get();
        while (!m.equals("Bye")) {
            System.out.println(m);
            m = message.get();
        }
        System.out.println(m);
    }

}
