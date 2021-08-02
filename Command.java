package com.company.coffee;

public class Command {
    private DrinkType drinkType;
    private int sugarQuantity;
    private String com;

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
}
