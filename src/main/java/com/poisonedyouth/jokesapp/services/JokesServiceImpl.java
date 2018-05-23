package com.poisonedyouth.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by matze on 23.05.2018
 */
@Service
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }

    public void setChuckNorrisQuotes(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }
}
