package org.example.exemplo;

import org.example.exemplo.MinhaThread;

public class Main {
    public static void main(String[] args) {
        var minhaRun = new MinhaThread("Thread Johnny", 500);
        Thread t = new Thread(minhaRun);

        var minhaRun2 = new MinhaThread("Thread Hugo", 500);
        Thread t2 = new Thread(minhaRun2);

        var minhaRun3 = new MinhaThread("Thread Joao", 500);
        Thread t3 = new Thread(minhaRun3);

        t.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t.start();
        t2.start();
        t3.start();
    }
}