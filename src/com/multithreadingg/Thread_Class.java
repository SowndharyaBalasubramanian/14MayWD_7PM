package com.multithreadingg;

public class Thread_Class {
    public static void main(String[] args){


        ThreadEx t5 = new ThreadEx();
        t5.start();

        ThreadEx t6 = new ThreadEx();
        t6.start();

    }
}

class ThreadEx extends Thread{
    @Override
    public void run(){
        System.out.println("The thread is running " + Thread.currentThread());
    }


}
