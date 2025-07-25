package com.multithreadingg;

public class Join_Ex1 {
    public static void main(String[] args){
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB(a);

        a.setName("Thread A");
        b.setName("Thread B");

        a.start();
        b.start();


        System.out.println("Main thread is running : " + Thread.currentThread().getName() );
    }
}

class ThreadA extends Thread{
    @Override
    public void run() {
        System.out.println("Thread a is Started : " + getName() );
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread A finished " + getName());
    }
}

class ThreadB extends Thread{

    Thread joinThread;
    //int age;

    public ThreadB(Thread jt){
        this.joinThread = jt;
    }
    @Override
    public void run() {
      // System.out.println("Thread a is Started : " + getName());
        try{
            System.out.println("Thread B is Started : " + getName());
            System.out.println("Thread B is waiting for Thread A");
            joinThread.join();    //a.join
            System.out.println("Thread B is resumed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread B finished " + getName());
    }
}
