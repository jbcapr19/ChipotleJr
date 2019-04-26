package com.company;

import java.util.ArrayList;

public class Burritto {
    String rice;
    String beans;
    String meat;
    String salsa;
    String veggie;
    ArrayList<String> extras;


    public Burritto() {

    }
    public Burritto(String rice, String beans, String meat, String salsa, String veggie, ArrayList<String> extras) {
        this.rice = new String(rice);
        this.beans = new String(beans);
        this.meat = new String(meat);
        this.salsa = new String(salsa);
        this.veggie = new String(veggie);
        this.extras = new ArrayList<String>();
        for(String s:extras) {
            this.extras.add(s);
        }
    }
    public void setRice(String riceOption) {
        this.rice = new String(riceOption);
    }
    public String getRice() {
        return(this.rice);
    }

    public void setBeans(String beansOption) {
        this.beans = new String(beansOption);
    }
    public String getBeans() {
        return(this.beans);
    }
    public void setMeat(String meatOption) {
        this.meat = new String(meatOption);
    }
    public String getMeat() {
        return(this.meat);
    }

    public void setSalsa(String salsaOption) {
        this.salsa = new String(salsaOption);
    }
    public String getSalsa() {
        return(this.salsa);
    }

    public void setVeggie(String veggieOption) {
        this.veggie = new String(veggieOption);
    }
    public String getVeggie() {
        return(this.veggie);
    }

    public void setExtras(ArrayList <String> extraOptions) {
        this.extras = new ArrayList<String>();
        for(String s:extraOptions) {
            this.extras.add(s);
        }
    }
    public ArrayList<String> getExtras() {
        return(this.extras);
    }
    public void printBurritto(Burritto b) {
        System.out.print("" +this.rice +" " +this.beans +" "+this.meat +" "+ this.veggie+" ");
    }
    public float getPriceOfBurritto(Burritto b) {
        float price = 3;
        if(!(b.rice.equalsIgnoreCase("none")))
            price += .5;
        if(!(b.beans.equalsIgnoreCase("none")))
            price += .5;
        if(!(b.meat.equalsIgnoreCase("none")))
            price += .5;
        if(!(b.salsa.equalsIgnoreCase("none")))
            price += .5;
        if(!(b.veggie.equalsIgnoreCase("none")))
            price += .5;

        for(String s:b.extras) {
            price += .5;
        }

        return price;
    }
}
