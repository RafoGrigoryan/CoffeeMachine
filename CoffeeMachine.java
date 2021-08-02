package com.company.coffee;

public class CoffeeMachine {
    public Cup  makeDrink(Command command){
        Cup cup = new Cup();
        if (command.getDrinkType().equals("TEA")){
            Tea tea = new Tea();
            cup.setDrink(tea);
        } else if (command.getDrinkType().equals("COFFE")){
            Coffee coffee = new Coffee();
            cup.setDrink(coffee);
        } else if (command.getDrinkType().equals("CHOCOLATE")){
            Chocolate chocolate = new Chocolate();
            cup.setDrink(chocolate);
        }
        if (command.getSugarQuantity()>0){
            Stick stick = new Stick();
            cup.setStick(stick);
        }
        if (command.getSugarQuantity()>0){
            Sugar[] sugars = new Sugar[command.getSugarQuantity()];
            for (int i = 0; i < sugars.length; i++) {
                Sugar sugar = new Sugar();
                sugars[i]=sugar;
            }
            cup.setSugars(sugars);
        }
        return cup;
    }
}

