package com.company.construction;

import com.company.construction.TestClass;

/**
 * Created by vkorol on 3/31/2015.
 */
public class HomeWork4 {
    public static void main(String[] args){

        String a = "Hello Example";
        System.out.println(a);
// Hello Example
        String t = "Hello Class";
        System.out.println(t);
// Hello Class
        String ts = ",and Student";
        System.out.println(t + ts);
// Hello Class, and Student!

        String [] u = {"a","b", "Under key one but three", "d", "e", "Under key five"};
        System.out.println(u[5]);
// Under key five

        System.out.println(u[3-1]);
// Under key one but three


        for (int x=8; x < 11; x++) {
            System.out.println(x);
        }
// 8
// 9
// 10

        String [] s = {"How", "are","you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
// How
// are
// you



        int[] m = {10, 20, 25, 30};
        int i = 0;
        int b = 25;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
// 10
// 20


        int[] n = {10, 20, 25, 30};
        int j = 0;
        int d = 10;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
// 20
// 25
// 30


        TestClass c = new TestClass("Hello World");
        System.out.println(c.say);
// Hello World;
        c.update = ("Goodbye World");

        System.out.println( c.update );
// Goodbye World
    }

}
