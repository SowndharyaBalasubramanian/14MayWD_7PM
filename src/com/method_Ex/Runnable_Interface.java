package com.method_Ex;

public class Runnable_Interface {
    public static void main(String[] args){
        MyThread mt1 = new MyThread();
        Thread t1 = new Thread(mt1);
        t1.start();

        Thread t2 = new Thread(mt1);
        t2.start();

        Thread t3 = new Thread(new MyThread());
        t3.run();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable interface is running");
    }
}
