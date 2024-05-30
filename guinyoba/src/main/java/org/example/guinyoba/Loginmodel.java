package org.example.guinyoba;

public class Loginmodel {
    private final String USERNAME = "Hafizh";
    private final String PASSWORD = "321";

    public boolean authenticate(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}

