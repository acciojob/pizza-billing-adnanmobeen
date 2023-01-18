package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

     boolean ischeeseadded;
     boolean istoppingsadded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            this.price = 300;
            this.bill="300";
        }
        else {
            this.price = 400;
            this.bill = "400";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeeseadded) {
            int b = Integer.parseInt(bill);
            b = b + 80;
            bill = Integer.toString(b);
            ischeeseadded = true;
            return;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingsadded) {
            int b = Integer.parseInt(bill);
            if (isVeg == true) {
                b = b + 70;
                bill = Integer.toString(b);
            } else {
                b = b + 120;
                bill = Integer.toString(b);
            }
            istoppingsadded = true;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        int b = Integer.parseInt(bill);
        b = b + 20;
        bill = Integer.toString(b);
        return;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
