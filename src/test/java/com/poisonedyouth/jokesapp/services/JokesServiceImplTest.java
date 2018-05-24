package com.poisonedyouth.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class JokesServiceImplTest {

    @InjectMocks
    private JokesServiceImpl jokesService;

    @Mock
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void getJoke(){
        when(chuckNorrisQuotes.getRandomQuote()).thenReturn("test");

        assertThat(jokesService.getJoke()).isEqualToIgnoringCase("test");
    }

}