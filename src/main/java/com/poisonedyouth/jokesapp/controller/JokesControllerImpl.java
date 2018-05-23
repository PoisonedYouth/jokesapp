package com.poisonedyouth.jokesapp.controller;

import com.poisonedyouth.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by matze on 23.05.2018
 */
@Controller
public class JokesControllerImpl implements JokesController  {

    @Autowired
    private JokesService jokesService;

    @Override
    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
