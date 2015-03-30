package com.company;

/**
 * Created by Admin on 30.03.15.
 */
public class door {
    public int height;
    public boolean isOpened;

    public door (int h){         //constructor
    height=h;
    isOpened=true;

    }

    public void close (){   //новая функция или метод
        isOpened=false;


    }



}
