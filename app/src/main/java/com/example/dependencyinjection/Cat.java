package com.example.dependencyinjection;

public class Cat implements Animal {

    private String song;

    public Cat(String song) {
        this.song = song;
    }
    @Override
    public String song() {
        return song;
    }
}
