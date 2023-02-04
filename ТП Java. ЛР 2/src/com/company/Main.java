package com.company;

import java.util.Locale;

/**
 * @author artem
 * @version 1.1
 * @project ТП Java. ЛР 2
 * @date 08.02.2022 21:52
 * @class temp
 */

public class Main {

    public static void main(String[] args) {
        // Сани пло и воз зов и толп и нас
        //never odd or  even
        String str = " арге   нтина манит негр    а".toLowerCase(Locale.ROOT);
//        System.out.println(palindrome1(str));
//        System.out.println(palindrome2(str));
//        System.out.println(palindrome3(str);
        System.out.println(palindromExtra(str));
    }

    public static boolean palindrome1(String str){
        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[^A-Za-zА-Яа-яї]", "");
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if (str.charAt(i) != str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome2(String str){
        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[^A-Za-zА-Яа-яї]", "");
        String reversedStr = "";
        int length = str.length();
        for (int i = length-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != reversedStr.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome3(String str){
        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[^A-Za-zА-Яа-яї]", "");
        int length = str.length();

        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        return reversedStr.equals(str);
    }

    public static boolean isPalindromExtra(String str){
        int len = str.length();
        int i = 0;
        int j = len - 1;

        while(i < len && j >= 0){
            if (str.charAt(i) == ' ') {
                i++;
                continue;
            }
            if (str.charAt(j) == ' ') {
                j--;
                continue;
            }
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
