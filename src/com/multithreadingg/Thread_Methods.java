package com.multithreadingg;

public class Thread_Methods {
    public static void main(String [] args) throws InterruptedException {
        ThreadClass t1 = new ThreadClass();
        t1.setName("Thread A");
        t1.setPriority(10);
        System.out.println(t1.getState() + " before starting the thread");
        t1.start();
        t1.sleep(1500);
        System.out.println(t1.getState() + " State of the thread a");

        ThreadClass t2 = new ThreadClass();
        t2.setName("Thread B");
        t2.setPriority(1);
        System.out.println(t1.isAlive() + " thread a is alive" + t1.getState());
        t2.start();


//        ThreadClass t3 = new ThreadClass();
//        t3.setName("Thread c");
//        t3.setPriority(5);
//        System.out.println(t3.isAlive());
//        t3.start();
//        System.out.println(t3.isAlive());

    }
}

class ThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <5 ; i++){
            System.out.println("count : " + i + " " + Thread.currentThread().getName()+ " " + getPriority() + " " + isAlive() + " " + getState());
            try{
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }


        }
    }
}
