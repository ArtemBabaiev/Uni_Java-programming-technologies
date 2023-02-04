package com.company;
/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 3
 * @date 13.02.2022 14:38
 * @class Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(calculateIntegral(0, Math.PI, 100000, 1.0));

    }

    public static double calculateIntegral(double start, double end, int steps, double upperBound){
        double totalArea = 0;
        double width = Math.abs(end-start)/steps;
        double downLeftCornerPosition = start;
        for (int i = 0; i < steps; i++) {
            double height = Math.sin(downLeftCornerPosition);
            if (height >= upperBound){
                totalArea += upperBound * width;
            }
            else{
                totalArea += height*width;
            }
            downLeftCornerPosition += width;
        }
        return totalArea;
    }
}
