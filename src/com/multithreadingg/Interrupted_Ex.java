package com.multithreadingg;

import java.util.Scanner;

class SleepingThread extends Thread{
    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        try{
//            System.out.println("Thread is going to sleep" + );
//            int threadsam = s.nextInt();
//
//           // Thread.sleep(2500);
//            System.out.println("Thread woke up");

            int threadsam;
            while(!Thread.currentThread().isInterrupted()){

                System.out.println("Thread is running ");
                threadsam  = s.nextInt();

            }

            System.out.println("Thread was interrupted");
        } catch (Exception e) {
            System.out.println("Exception caught becaz thread is interrupted");
            System.out.println(e);
        }

    }
}

public class Interrupted_Ex {
    public static void main(String [] args){
        SleepingThread t1 = new SleepingThread();
        t1.start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

      //  System.out.println("main thread interrupting the thraead");
        t1.interrupt();
    }
}
