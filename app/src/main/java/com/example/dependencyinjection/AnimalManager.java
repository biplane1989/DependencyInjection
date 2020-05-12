package com.example.dependencyinjection;

import android.util.Log;

public class AnimalManager implements Manager {

    Animal animal;

    public AnimalManager(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String AnimalSong() {
        return animal.song();
    }
}
