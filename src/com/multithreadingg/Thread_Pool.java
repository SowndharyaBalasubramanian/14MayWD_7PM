package com.multithreadingg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 7; i++) {
            Runnable task = new WorkerTask("Task : " + i);
            executor.execute(task);
        }

        System.out.println("For loop finished");

        for (int i = 8; i <= 12; i++) {
            Runnable task = new WorkerTask("Task : " + i);
            executor.execute(task);
        }
        System.out.println("For loop 2 finished");
        executor.shutdown();
    }
}

    class WorkerTask implements Runnable{
        private String taskName;

        WorkerTask(String name){
            this.taskName = name;
        }

        @Override
        public void run() {
            System.out.println(taskName + " is exeuting by " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(taskName + " is completed by " + Thread.currentThread().getName());
        }

}


