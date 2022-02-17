package com.company;

    //Setting properties
public class Sandwich1 {
    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    //Custom Constructor
    public Sandwich1(String bread, String protein, String cheese, boolean wantVeggies ){
        breadType = bread ;
        proteinType = protein ;
        cheeseType = cheese ;
        veggies = wantVeggies;
    }
    //Preset Additional constructor
     public Sandwich1(String proteinOption, String cheeseOption, boolean veggieOption){
        breadType = "wheat " ;
        proteinType = proteinOption ;
        cheeseType = cheeseOption ;
        veggies = veggieOption ;
     }

     //Preset sandwich to come with only bread
        public Sandwich1(){
        breadType = "rosemary herb ";
        }

        //Preset additional constructor
        public Sandwich1(String chooseProtein) {
            breadType = "rosemary herb ";
            proteinType = chooseProtein ;
            cheeseType = " mozzarella ";
            veggies = true;
        }

    //Setters & Getters

    public void setBreadType(String bread) {
        breadType = bread;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setProteinType(String protein) {
        proteinType = protein;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setCheeseType(String cheese) {
        cheeseType = cheese;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setVeggies(boolean vegetables) {
        veggies = vegetables;
    }

    public boolean getVeggies() {
        return veggies;
    }

    //Method that prints out sandwich details
    public void describeSandwich1() {
        System.out.println(getBreadType() + getProteinType() + getCheeseType() + getVeggies());
    }

    }
