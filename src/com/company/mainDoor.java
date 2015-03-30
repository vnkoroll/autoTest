package com.company;

/**
 * Created by Admin on 30.03.15.
 */
public class mainDoor {
    public static void main(String[] args) {


        door k = new door(100);
        door l = new door(190);
        System.out.println("k.height is " + k.height);
        if (k.isOpened){
            System.out.println ("k is Open");
        }
        else {
            System.out.println ("k is Closed");
        }
k.height=500;
        System.out.println("k.height is " + k.height);
        k.close();
        if (k.isOpened){
            System.out.println ("k is Open");
        }
       else {System.out.println ("k is Closed");
        }

    }

}
