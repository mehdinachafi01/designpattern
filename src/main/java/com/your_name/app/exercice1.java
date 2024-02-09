package com.your_name.app;

/**
 * Hello world!
 *
 */
public class exercice1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class DatabaseConnector {
    private static DatabaseConnector instance;

    private DatabaseConnector() {
    }

    public static DatabaseConnector getInstance() {

        if (instance == null) {
            instance = new DatabaseConnector();
        }

        return instance;
    }
}