package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

     boolean ischeeseadded = false;
     boolean istoppingsadded = false;

     private boolean isTakeawayadded = false;

     private int basepizzaprice;

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
      basepizzaprice = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeeseadded) {

            ischeeseadded = true;
            this.price += 80;
           // return;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingsadded) {
            istoppingsadded = true;
            if (isVeg == true) {
                price += 70;
            } else {
                price += 120;
            }

        }
       // return;
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
        str.append("Base Price Of The Pizza: "+basepizzaprice+'\n');
        if(ischeeseadded){
            str.append("Extra Cheese Added: "+80+'\n');
        }
        if(istoppingsadded){
            str.append("Extra Toppings Added: "+toppings+'\n');
        }
        if(isTakeawayadded){
            str.append("Paperbag Added: "+20+'\n');
        }
        str.append("Total Price: "+price+'\n');
        bill = str.toString();
        return this.bill;
    }
}
