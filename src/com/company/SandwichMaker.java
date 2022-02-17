package com.company;

public class SandwichMaker {

    public static void main(String[] args) {
    Sandwich1 mySandwich = new Sandwich1( "ciabatta " , "bacon " , "gouda " , true);
    mySandwich.describeSandwich1();

    Sandwich1 johnsSandwich = new Sandwich1( "wheat " , "turkey ", "cheddar " , false);
    johnsSandwich.describeSandwich1();

    Sandwich1 sofiasSandwich = new Sandwich1( "ham", "cheddar" , true);
    sofiasSandwich.describeSandwich1();

    Sandwich1 juliasSandwich = new Sandwich1 ();
    juliasSandwich.describeSandwich1();

    Sandwich1 popsSandwich = new Sandwich1("bacon");
    popsSandwich.describeSandwich1();


    }
}
