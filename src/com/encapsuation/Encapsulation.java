package com.encapsuation;

public class Encapsulation {
    public static void main(String[] args){

        Bank b = new Bank();
       //b.accNo= 678;              //not possible directly
        b.setAccNo(485);
        System.out.println(b.getAccNo());
       // b.display();
    }
}

class Bank{
    private int accNo;
//
//    Bank(int accNo){
//        this.accNo = accNo;
//        System.out.println(accNo);
//    }

    public void display(){
        System.out.println(accNo);
    }

    public int getAccNo() {
        return accNo;
    }

    protected void setAccNo(int accNo) {
        this.accNo = accNo;

    }


}

//setters
