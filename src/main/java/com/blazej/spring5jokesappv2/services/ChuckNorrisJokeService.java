package com.blazej.spring5jokesappv2.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
