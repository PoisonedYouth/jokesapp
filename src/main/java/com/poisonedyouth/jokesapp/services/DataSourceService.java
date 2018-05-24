package com.poisonedyouth.jokesapp.services;

import com.poisonedyouth.jokesapp.datasource.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by matze on 24.05.2018
 */
@Service
public class DataSourceService {

    @Autowired
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }
}
