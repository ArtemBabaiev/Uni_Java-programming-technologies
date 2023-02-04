package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;


/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 4
 * @date 15.02.2022 18:27
 * @class Main
 */

public class Main {


    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("harry.txt")));
        text = text.replaceAll("[^A-Za-z ]", "").toLowerCase(Locale.ROOT);

        String[] textByWords = text.split(" +");
        text = null;
        Arrays.sort(textByWords);

        String distinctWordsString = " ";
        for (int i = 0; i < textByWords.length; i++) {
            if (!distinctWordsString.contains(" " + textByWords[i] + " ")){
                distinctWordsString += textByWords[i]+" ";
            }
        }

        String[] distinctWords;
        distinctWords = distinctWordsString.split("\\s+");
        distinctWordsString = null;
        //System.out.println(textByWords.length);
        /*for (int i = 0; i < distinctWords.length; i++) {
            if (distinctWords[i].equals("the")) {
                System.out.println(distinctWords[i]);
            }
        }*/

        System.out.println("Words in alphabetical order:");
        for (int i = 1; i < 11; i++) {
            System.out.print(distinctWords[i]);
            if (i != 10){
                System.out.print(" ") ;
            }
            else{
                System.out.println();
            }
        }

        int[] quantity = new int[distinctWords.length];
        for (int i = 0; i < distinctWords.length; i++) {
            int quantityOfWord = 0;
            for (int j = 0; j < textByWords.length; j++) {
                if (distinctWords[i].equals(textByWords[j])){
                    quantityOfWord++;
                }
            }
            quantity[i] = quantityOfWord;
        }

        int n = distinctWords.length;

        for (int i = 0; i < n-1; i++)
        {
            int maxIndex = i;
            for (int j = i+1; j < n; j++)
                if (quantity[j] > quantity[maxIndex])
                    maxIndex = j;

            int temp = quantity[maxIndex];
            quantity[maxIndex] = quantity[i];
            quantity[i] = temp;
            String tempStr = distinctWords[maxIndex];
            distinctWords[maxIndex] = distinctWords[i];
            distinctWords[i] = tempStr;
        }
        System.out.println("10 the most used words and their frequency:");
        for (int i = 0; i <10 ; i++) {

                System.out.println(distinctWords[i] + " - " + quantity[i]);


        }





    }
}
