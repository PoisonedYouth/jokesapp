package com.poisonedyouth.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by matze on 23.05.2018
 */
@Service
public class JokesServiceImpl implements JokesService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
