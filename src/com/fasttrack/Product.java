package com.fasttrack;

public class Product {

    private String name;
    private int price;
    private int quantity;

    private boolean stock;
    private int category;


    public Product(String name,int price ,int quantity,boolean stock,int category){
        this.name =name;
        this.price= price;
        this.quantity= quantity;
        this.category= category;
        this.stock=stock;
        this.category=category;

    }
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean hasStock() {
        if (quantity > 0);
          return this.stock;

    }
    public int getCategory(){
        return this.category;


    }
    public String isCategory(){
        if(category == 5);
        return "true";
    }




}
