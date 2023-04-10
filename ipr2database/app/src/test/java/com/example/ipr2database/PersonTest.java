package com.example.ipr2database;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
    @Test
    public void constructorTest() {
        Person person = new Person("Gina", "CEO", 12000);
        assertEquals("Gina", person.getName());
        assertEquals("CEO",person.getPost());
        assertEquals(12000,person.getSalary());
    }
    @Test
    public void setUsernameTest() {
        Person person = new Person("", "example", 111);
        person.setName("Gina");
        assertEquals("Gina", person.getName());
    }
}