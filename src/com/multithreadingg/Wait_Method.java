package com.multithreadingg;

public class Wait_Method {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();

        CustomerThread customer1 = new CustomerThread(restaurant , "customer 1");
        CustomerThread customer2 = new CustomerThread(restaurant , "customer 2");
        CustomerThread customer3 = new CustomerThread(restaurant , "customer 3");

        ChefThread chef = new ChefThread(restaurant);

        customer1.start();
        customer2.start();
        customer3.start();
        chef.start();
    }
}

class Restaurant{
    private boolean foodReady = false;

    public synchronized void waitForFood(){
        System.out.println("Customer is waiting for the food");

        while (!foodReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("customer is eating after receiving" );
    }

    public synchronized void serveFood(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        foodReady = true;
        System.out.println("chef is notifying the customer");
        notifyAll();
    }

}

class CustomerThread extends Thread{
String customerName;
    Restaurant restaurant;

    public CustomerThread(Restaurant restaurant , String customerName){
        this.restaurant = restaurant;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        restaurant.waitForFood();
    }
}

class ChefThread extends Thread{

    Restaurant restaurant;

    public ChefThread(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.serveFood();
    }
}