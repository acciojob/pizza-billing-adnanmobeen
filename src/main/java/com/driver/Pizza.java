package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

     boolean ischeeseadded;
     boolean istoppingsadded;

     private boolean isTakeawayadded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            this.price = 300;
           // this.bill="300";
        }
        else {
            this.price = 400;
           // this.bill = "400";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeeseadded) {

            ischeeseadded = true;
            price += 80;
            return;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingsadded) {
            //int b = Integer.parseInt(bill);
            if (isVeg == true) {
                price += 70;
            } else {
                price += 120;
            }
            istoppingsadded = true;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayadded){
            isTakeawayadded = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        int toppings;
        if(isVeg){
            toppings = 70;
        }
        else{
            toppings = 120;
        }
        StringBuilder str = new StringBuilder("");
        str.append("Base Price Of The Pizza: "+price+'\n');
        if(ischeeseadded){
            str.append("Extra Cheese Added: "+toppings+'\n');
        }
        if(isTakeawayadded){
            str.append("Paperbag Added: "+20+'\n');
        }
        str.append("Total Price: "+price+'\n');
        bill = str.toString();
        return this.bill;
    }
}
