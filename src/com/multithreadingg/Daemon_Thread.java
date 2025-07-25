package com.multithreadingg;

public class Daemon_Thread {
    public static void main(String[] args) {
        DaemonThread Dt = new DaemonThread();
        DaemonThread Dt1 = new DaemonThread();
        DaemonThread Dt2 = new DaemonThread();

        Dt.setDaemon(false);
        Dt1.setDaemon(true);

       // Dt.start();
        Dt1.start();
        //Dt2.start();

    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        while (isDaemon() == true){

            System.out.println("Its a daemon thread");
           setDaemon(false);
        }

        System.out.println("User thread");
    }
}
