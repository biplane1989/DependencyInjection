package com.example.dependencyinjection;

public class Dog implements Animal {

    private String song;

    public Dog(String song) {
        this.song = song;
    }

    @Override
    public String song() {
        return song;
    }
}
