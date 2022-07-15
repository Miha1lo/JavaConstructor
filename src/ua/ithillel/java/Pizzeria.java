package ua.ithillel.java;

/**
 * There are creating objects of pizza
 * and collect in array Pizza menu.
 * author Mikhailo Tyurin
 */

public class Pizzeria {
    public static void main(String[] args) {

        Pizza meaty = new Pizza("М\'ясна",
                new String[]{"Бекон", "шинка", "салямі", "помідор", "цибуля маринована", "моцарелла",
                        "фірмовий соус"},
                115,
                30);

        Pizza carbonara = new Pizza("Карбонара",
                new String[]{"Бекон", "шинка", "печериці", "цибуля маринована", "оливки",
                        "моцарелла", "фірмовий соус"},
                95,
                30);

        Pizza pepperoni = new Pizza("Паперонi",
                new String[]{"Пепероні", "італійські трави", "моцарелла", "фірмовий соус"},
                135,
                35);

        Pizza francesca = new Pizza("Франческа",
                new String[]{"Бекон", "салямі", "печериці", "помідор", "маслини", "моцарелла", "фірмовий соус"},
                95,
                25);

        Pizza[] pizzaMenu = {meaty, carbonara, pepperoni, francesca};

        for (int i = 0; i < pizzaMenu.length; i++) {
            pizzaMenu[i].printPizzaInfo();
            System.out.println();
        }
    }
}