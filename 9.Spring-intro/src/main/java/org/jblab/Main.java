package org.jblab;

import org.jblab.entity.Musician;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aidar Shaifutdinov.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Musician musician = context.getBean(Musician.class);
        musician.perform();
        System.out.println(musician.getAchievements());
    }

}
