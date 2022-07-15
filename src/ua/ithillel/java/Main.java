package ua.ithillel.java;

/**
 * This class reads parameters of circle and print their:
 * -length in cm
 * -square in cm^2
 * author Mikhailo Tyurin
 */

public class Main {
    public static void main(String[] args) {

        Circle circ1 = new Circle(10);

        System.out.println();

        Circle circ2 = new Circle(11, "Red");

        circ1.printInfoCircle();

        System.out.println();

        circ2.printInfoCircle();
    }
}
