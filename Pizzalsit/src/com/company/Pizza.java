package com.company;

public class Pizza {
    int i;
    String pizza;
    int price;

    public Pizza(int i, String pizza, int price) {
        this.i = i;
        this.pizza = pizza;
        this.price = price;
    }

    public int getId() {
        return i;
    }

    public void setId(int id) {
        i = id;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "\nID="+getId()+"::Pizza: "+getPizza()+"::Price ="+getPrice();
    }
}

