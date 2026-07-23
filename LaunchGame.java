package org.encapsulation;
//Encapsulation
//private keyword is to make the imporatnt part of code to be inaccessicble from outside.
// To fetch and set data we are using getter and setter.
class BankAccount {
    private float bal;

    public void setData(float x) {
        if (x > 0) { //to prevent negative values
            bal = x;
        }
    }

    public float getData() {
        return bal;
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setData(80884);
        System.out.println(ba.getData());
    }
}
