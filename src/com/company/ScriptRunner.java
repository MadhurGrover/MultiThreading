package com.company;

public class ScriptRunner implements Runnable {

    private int threadNumber;

    public ScriptRunner(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread:" + threadNumber + "  , Execution cycle: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
