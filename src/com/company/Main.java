package com.company;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Person person = Person.builder()
                .name("Ivan")
                .lastName("Ivanov")
                .birthDate(Date.valueOf("01.02.1990"))
                .build();

    }
}
