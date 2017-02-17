package org.jblab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author aleksandrpliskin on 14.12.16.
 */
public class Main {

    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring-config.xml");

//        Player player1 = (Player) context.getBean("pianoPlayer");
//        player1.play();


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        applicationContext.getBean("guitar");
    }

}
