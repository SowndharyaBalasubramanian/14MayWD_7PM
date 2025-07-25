package com.multithreadingg;

import com.datatype.Obj;

public class Synchronised_Method {
    public static void main(String[] args){

        Object lock = new Object();
        ThreadExample t1 = new ThreadExample("Thread 1" , lock);
        ThreadExample t2 = new ThreadExample("Thread 2" , lock);

        t1. start();
        t2.start();
    }
}

class ThreadExample extends Thread{
    private String threadName;
    private Object lock;

    public ThreadExample(String threadName, Object lock){
        this.threadName = threadName;
        this.lock =lock;
    }

//    public synchronized void printNumbers(){
//        for(int i = 1; i < 6; i++){
//            System.out.println(threadName + " print value : " + i);
//            try{
//                Thread.sleep(700);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }

    @Override
    public void run() {
       // printNumbers();
        synchronized (lock){
            for(int i = 1 ; i <= 4; i++){
                System.out.println(i);
                try{
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            }
        }
    }
}
