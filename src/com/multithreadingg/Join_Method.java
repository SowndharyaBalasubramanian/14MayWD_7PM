package com.multithreadingg;

class ThreadJoin extends Thread{
    @Override
    public void run() {

        System.out.println("Thread started working");
        for(int j = 1; j <3 ; j++){
            try {

                System.out.println(j + " User thread priority : " + Thread.currentThread().getPriority());
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("thread finished work");
    }
}



public class Join_Method {
    public static void main(String[] args){
        ThreadJoin ThrA = new ThreadJoin();
        ThrA.start();

        ThreadJoin ThrB = new ThreadJoin();
        ThrB.start();

        System.out.println(" main thread priority : " + Thread.currentThread().getPriority());

        try{
            System.out.println("thr B is waiting for thread A to complete");

            ThrA.join();
            System.out.println("Thread b is resuming");
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }
}
