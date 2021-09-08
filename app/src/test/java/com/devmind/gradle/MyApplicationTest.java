package com.devmind.gradle;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {

    MyApplication application = new MyApplication();


    @Test
    public void shouldSayHello(){
        Assertions.assertEquals("I want to learn Gradle", application.getMessage());
    }

}