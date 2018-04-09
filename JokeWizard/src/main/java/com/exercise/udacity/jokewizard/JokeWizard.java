package com.exercise.udacity.jokewizard;

import com.exercise.udacity.jokes.JokeSmith;

public class JokeWizard {
    public String getJoke(boolean isFromWizard) {
        JokeSmith jokeSmith = new JokeSmith();
        return jokeSmith.getJoke(isFromWizard);
    }
}
