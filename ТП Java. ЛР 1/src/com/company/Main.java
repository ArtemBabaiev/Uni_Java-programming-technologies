package com.company;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 1
 * @date 01.02.2022 - 19:27
 * @class Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("My name is Artem Babaiev");

        char gender = 'M';
        System.out.println("Sex: " + gender);

        byte age = 19;
        System.out.println("My age is " + age + " year old");

        short height = 183;
        System.out.println("I am about " + height + " cm tall");

        int population =  624_750;
        System.out.println("I came to the university from Kriviy Rig with population of " + population);

        long distance = 69_850_000l;
        float time = 12.2f;
        System.out.println("The length of trip is " + distance + " and it takes " + time + " hours");

        boolean isRightHanded = true;
        System.out.println("Right handed: " + isRightHanded + " / Left handed: " + !isRightHanded);

        double pi = Math.PI;
        System.out.println("Pi value = " + pi);
    }
}
