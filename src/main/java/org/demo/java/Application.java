package org.demo.java;

import org.demo.java.aop.StringModifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StringModifier modifier = context.getBean(StringModifier.class);
        String ourString = "There was a old man and he was pacing around the park.";

        String modifiedString = modifier.ReplaceAllA(ourString);
        System.out.println(modifiedString);
        context.close();
    }

}
