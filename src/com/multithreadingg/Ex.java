package com.multithreadingg;

public class Ex {
    public static void main(String [] args){
        SimpleThread t1= new SimpleThread();
        t1.start();

        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        t1.interrupt();
    }
}

class SimpleThread extends Thread{
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("Running");
        }

        System.out.println("Thread was interrupted");
    }
}
