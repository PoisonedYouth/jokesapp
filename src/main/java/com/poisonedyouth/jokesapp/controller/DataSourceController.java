package com.poisonedyouth.jokesapp.controller;

import com.poisonedyouth.jokesapp.services.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by matze on 24.05.2018
 */
@Controller
public class DataSourceController {

    @Autowired
    private DataSourceService dataSourceService;

    @RequestMapping("/datasource")
    public String getDataSource(Model model){
        model.addAttribute("datasource", dataSourceService.getDataSource());
        return "datasource";
    }
}
