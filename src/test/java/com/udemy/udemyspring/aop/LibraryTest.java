package com.udemy.udemyspring.aop;

import com.udemy.udemyspring.aop.config.MyConfig;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private AnnotationConfigApplicationContext context;

    @BeforeEach
    public void createContext() {
        this.context = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    public void getBook() {
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
    }

    @AfterEach
    public void closeContext() {
        this.context.close();
    }
}