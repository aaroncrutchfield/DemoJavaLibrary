package com.exercise.udacity.createjavalibrary;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.exercise.udacity.jokes.JokeSmith;
import com.exercise.udacity.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith jokeSmith = new JokeSmith();
        String fromJokeSmith = jokeSmith.getJoke(false);

        JokeWizard jokeWizard = new JokeWizard();
        String fromJokeWizard = jokeWizard.getJoke(true);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, MainActivityFragment.newInstance(fromJokeSmith, fromJokeWizard))
                .commit();

    }
}
