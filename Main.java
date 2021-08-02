package com.company.coffee;

import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splint = input.split(":");
        String drinkCod = splint[0];
        String sugarCod = splint[1];

        Command command = new Command();
        if (drinkCod.equals("T")){
            command.setDrinkType(DrinkType.TEA);
            command.setSugarQuantity(Integer.parseInt(sugarCod));
        } else {
            if (drinkCod.equals("C")) {
                command.setDrinkType(DrinkType.COFFEE);
            } else if (drinkCod.equals("S")) {
                command.setDrinkType(DrinkType.CHOCOLATE);
            }
        }
            command.setSugarQuantity(Integer.parseInt(sugarCod));
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeDrink(command);
        Cup cup = coffeeMachine.makeDrink(command);
        System.out.println(cup);
    }
}
