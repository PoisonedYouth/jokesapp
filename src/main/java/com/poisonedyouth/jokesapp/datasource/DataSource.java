package com.poisonedyouth.jokesapp.datasource;

/**
 * Created by matze on 24.05.2018
 */
public class DataSource {
    private String username;
    private String password;
    private String dbUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
