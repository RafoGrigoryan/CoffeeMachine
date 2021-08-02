package com.company.coffee;

public class Chocolate extends Drink{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
