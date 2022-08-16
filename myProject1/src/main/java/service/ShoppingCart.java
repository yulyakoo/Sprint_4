package service;
import model.Food;

public class ShoppingCart{ //создали класс для корзины - ShoppingCard

    Food[]foodArray;

    public ShoppingCart(Food[]foodArray){
        this.foodArray = foodArray;
    }

    public double amountNoDiscount() {
        double total = 0;
        for (int i = 0; i < foodArray.length; i++) {
            total = total + (foodArray[i].getAmount() * foodArray[i].getPrice());
        }
        return total;

    }
    public double amountWithDiscount() {
        double total = 0;
        for (int i = 0; i < foodArray.length; i++) {
            double totalPrice = foodArray[i].getAmount() * foodArray[i].getPrice();
            double discount = 1 - (foodArray[i].getDiscount() / 100);
            total = total + (totalPrice * discount);
        }
        return total;
    }
    public double amountVegetarianNoDiscount() {
        double total = 0;
        for (int i = 0; i < foodArray.length; i++) {
            if (foodArray[i].isVegetarian()) {
                total = total + (foodArray[i].getAmount() * foodArray[i].getPrice());
            }
        }
        return total;
    }
}