package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConfiguration;
import com.in28minutes.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            System.out.println(context.getBean("game"));
            System.out.println(context.getBean("game2"));
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

            GameRunner gameRunner2 = (GameRunner)context.getBean("gameRunner2");
            gameRunner2.run();
        }
    }
}
