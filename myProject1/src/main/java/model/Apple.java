package model;
import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;
import static model.constants.Discount.GREEN_APPLE_DISCOUNT;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food{ //объявили класс Apple - наследник класса Food

    private String colour;
    public Apple (int amount, double price, String colour){ //конструктор класса Apple принимающий количество, цену и цвет яблок — и устанавливающий флаг isVegetarian
         this.amount = amount;
         this.price = price;
         this.colour = colour;
         isVegetarian = true;
         }

    @Override
    public double getDiscount() {
        if (colour == RED) {
            return RED_APPLE_DISCOUNT;
        } else if (colour == GREEN) {
            return GREEN_APPLE_DISCOUNT;
        }
        return 0;
    }



}


