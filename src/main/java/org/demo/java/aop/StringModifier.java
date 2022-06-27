package org.demo.java.aop;

import org.springframework.stereotype.Component;

@Component
public class StringModifier {

    public String ReplaceAllA(String replacee){
        System.out.println("String is being replaced.");
        return replacee.replace("a","A");
    }
}
