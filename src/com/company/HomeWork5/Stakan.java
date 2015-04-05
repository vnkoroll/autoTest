package com.company.HomeWork5;

/**
 * Created by Max on 05.04.2015.
 */
public class Stakan {
    public static void main(String[] args) {

        Stakan s = new Stakan("Super");
        Stakan k = new Stakan("Bigger");
        s = "S";
        System.out.println("s: " + s.imia);
        System.out.println("k: " + k.imia);
        System.out.println("Stakan: " + Stakan.material);
        System.out.println("Stakan: " + Stakan.vysota);
        System.out.println("s: " + s.procentZapolneniia());
/*
s: Super
k: Bigger
Stakan: Bumaga
Stakan: 10
s: 0
*/


    }
}
