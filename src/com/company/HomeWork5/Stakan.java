package com.company.HomeWork5;

/**
 * Created by Max on 05.04.2015.
 */
public class Stakan {
    public String imia;
    public static String material = "Bumaga";
    public static int vysota = 10;
    public int realCapacity = 0;

    // contructor
    public Stakan(String name){
        this.imia = name;
    }

    public static int obiom(int capacity){
        return capacity * 20;
    }

    public int procentZapolneniia(){
        return this.realCapacity;
    }

    public void nalit(int add){
        if((this.realCapacity + add) < 100)
            this.realCapacity += add;
        else
            this.realCapacity = 100;
    }

    public int vylit(){
        int vylit = realCapacity;
        this.realCapacity = 0;
        return vylit;
    }

    public String imia(){
        return imia;
    }
}
