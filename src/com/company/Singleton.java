package com.company;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance==NULL) {
            Singleton instance = new getInstance();
        }
        return instance;
    }
}
