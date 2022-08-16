import model.Meat;
import model.Food;
import model.Apple;
import service.ShoppingCart;
import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {

            Meat meat = new Meat(5, 100); //Мясо в количестве 5 кг по цене 100 рублей за кг
            Apple redApple = new Apple(10, 50, RED); //Яблоки красные в количестве 10 кг по цене 50 рублей
            Apple greenApple = new Apple(8, 60, GREEN); //Яблоки зелёные в количестве 8 кг по цене 60 рублей

        Food[] foods = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(foods);

        double amountNoDiscount = cart.amountNoDiscount();
        double amountWithDiscount = cart.amountWithDiscount();
        double amountVegetarianNoDiscount = cart.amountVegetarianNoDiscount();

        System.out.println("Общая сумма всех товаров без скидки: " + amountNoDiscount);
        System.out.println("Сумма скидки для всей корзины: " + amountWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидок: " + amountVegetarianNoDiscount);
    }
}






