package com.example.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Animal dog;
    Animal cat;
    Manager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = new Dog("Dog Hello");
        cat = new Cat("Cat Aloha");
        manager = new AnimalManager(dog);

        Log.d(TAG, "onCreate: " + dog.song());

    }
}
