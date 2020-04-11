package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i =0 ; i <30; i++) {
            ScriptRunner runner = new ScriptRunner(i);
            service.execute(runner);
        }
        service.shutdown();


    }
}
