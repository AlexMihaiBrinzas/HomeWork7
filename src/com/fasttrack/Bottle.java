package com.fasttrack;

public class Bottle {
    private boolean locked;

    private boolean opened = true;

    private String empty;
    private boolean capacity;
    private int liquid =2 ;

    private String state;


    public Bottle(boolean capacity,int liquid,String empty,boolean opened,boolean locked , String state) {
        this.capacity=capacity;
        this.liquid=liquid;
        this.empty=empty;
        this.opened=opened;
        this.locked=locked;
    }

    public boolean isCapacity() {
        if (liquid < 5) {
            return true;
        }else {
            return false;}
    }
    public int availableliquid(){
        return liquid;
    }
    public String getEmpty(){
        if(liquid < 1){
            return "not empty";
        }else{
            return "empty";
        }
    }
    /* public boolean isOpened() {
       return isOpened();
     }*/
    public Bottle(String state){
        this.state=state;

    }

    public String state() {
        return state;
    }
    public String getState(){
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean setOpened(){
        state="open";
        return true;
    }
    public boolean close(){
        state="close";
        return false;
    }
    public String output(){
        return "Bottle";
    }


}


