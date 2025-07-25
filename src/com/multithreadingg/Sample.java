package com.multithreadingg;

public class Sample {
    public static void main(String[] args){
        ThreadSample ts = new ThreadSample();
        ThreadSample ts1 = new ThreadSample();
        ThreadSample ts2 = new ThreadSample();


        ts.setPriority(10);
        ts1.setPriority(1);
        ts2.setPriority(5);


        ts.start();
        ts2.start();
        ts1.start();


    }
}

class ThreadSample extends Thread{
    @Override
    public void run() {
        System.out.println("running " + getName() + " " + getPriority());
    }
}
