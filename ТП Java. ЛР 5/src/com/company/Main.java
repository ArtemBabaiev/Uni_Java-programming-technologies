package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(7.0, 5.0);

        System.out.println("Area: " + rect.getArea());
        System.out.println("Area between diagonal: " + rect.getAngleBetweenDiagonal());
        System.out.println("Is it a square: " + rect.isSquare());
        System.out.println("Radius of outter circle: " + rect.radiusOfOutterCircle());
        System.out.println("Diagonal: " + rect.getDiagonal());
        System.out.println(rect.toString());
        System.out.println();

        System.out.println("H: " + rect.getHeight() + " | W: " + rect.getWidth());
        rect.setHeight(6);
        rect.setWidth(7);
        System.out.println("New H: " + rect.getHeight() + " | W: " + rect.getWidth());
        System.out.println();

        Rectangle rect1 = new Rectangle(5, 5);
        System.out.println(rect.toString());
        System.out.println(rect.hashCode());
        System.out.println(rect.equals(rect1));
    }
}

