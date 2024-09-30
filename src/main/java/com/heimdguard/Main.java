package main.java.com.heimdguard;

import main.java.com.heimdguard.DAO.DatabaseOperations;

public class Main {

    public static void main(String[] args) {
        
        DatabaseOperations dbOps = new DatabaseOperations();

        dbOps.insertUrl("http://exemplo.com");


    }
}