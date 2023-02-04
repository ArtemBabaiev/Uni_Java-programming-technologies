package edu.bab.libr.model;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 26.04.2022 23:45
 * @class Discount
 */
public enum Discount {
    PUPIL(0.5),
    STUDENT(0.7),
    PENSIONER(0.6),
    NONE(0);
    private double multiplier;

    Discount(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
