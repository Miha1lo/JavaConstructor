package ua.ithillel.java;

import java.util.Arrays;

/**
 * This class create attributes of Pizza:
 * name - String field
 * composition - String array of components pizza
 * diameter - pizza diameter in cm
 * cost - pizza price in UAH
 * void method "printPizzaInfo" - print information in console about pizza
 * author Mikhailo Tyurin
 */

public class Pizza {

    private String name;
    private String[] composition;
    private Circle basis;
    private int cost;
    private int diameter;

    public Pizza() {
    }

    public Pizza(String name, String[] composition, int cost, int diameter) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        this.diameter = diameter;
        this.basis = new Circle(this.diameter / 2);
    }

    public void printPizzaInfo() {
        System.out.println("Наименование: " + name);
        System.out.println("Состав пиццы: " + Arrays.toString(composition));
        System.out.println("Цена: " + cost);
        System.out.println("Размер пиццы: ");
        System.out.println("\t-диаметр: " + diameter);
        basis.printInfoCircle();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getComposition() {
        return composition;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
