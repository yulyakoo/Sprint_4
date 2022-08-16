package model;


    public class Meat extends Food{ //Meat наследник класса Food

      public Meat(int amount, double price){ //создали конструктор принимающий два входных параметра — количество и цену и устанавливающий значение для флага isVegetarian
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
        }

        @Override
        public double getDiscount() {
            return 0;
        }

    }

