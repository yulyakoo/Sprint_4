package model;

public abstract class Food implements Discountable { //объявили абстрактный класс Food
    protected int amount; //количество продукта в килограммах (целое число)
    protected double price; //цена за единицу (вещественное число)
    protected boolean isVegetarian; //флаг, который показывает, вегетарианский ли продукт

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    }




