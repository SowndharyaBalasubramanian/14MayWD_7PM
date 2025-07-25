package com.multithreadingg;

public class Join_Ex2 {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        t1.setName("Thread 1");
        t1.start();

        Thread1 t2 = new Thread1();
        t2.setName("Thread 2");


        try{
            t1.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("main thread is executing");
        t2.start();
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i =1 ; i<3; i++){
            System.out.println(i + " Thread name : " + Thread.currentThread());
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}