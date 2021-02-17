package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {


    public static void main(String[] args) {

        //  Task1(); // не доделано
        // Task2();
        // Task3();
        //Task4();
        // Task5(); // не доделано
        // Task6();
        //Task7();
        //Task8();
        // Task9();
        // Task11();
        Task10();

    }

    private static void Task1() {
        int let = 0, j = 0;
        String s = "ag fn hl mwt yo tbp";
        int is = s.length();
        Random rand = new Random();
        String w = "";

        for (int i = 0; i < 5; i++) {
            int lw = 2 + rand.nextInt(7);
            System.out.println(lw);

            j = 0;
            while (j < lw) {


                //  if ()

                j++;
            }

        }
        //   System.out.println(w);
    }

    private static void Task2() {
        final String englishFirstLetters = "QWERTYUIOPASDFGHJKLZXCVBNM_";
        final String englishOtherLetters = "QWERTYUIOPASDFGHJKLZXCVBNM_1234567890";


        String idNumber = "Admin54";

        idNumber = idNumber.trim().toUpperCase();
        System.out.println(idNumber);


        if (!englishFirstLetters.contains(idNumber.charAt(0) + "")) {
            System.out.println("Не является идентификатором " + idNumber.charAt(0));


        } else {

            for (int letters = 1; letters < idNumber.length(); letters++) {

                if (!englishOtherLetters.contains(idNumber.charAt(letters) + "")) {

                    System.out.println("Не является идентификатором " + idNumber.charAt(letters));
                    return;
                }


            }
            System.out.println(idNumber + " Является идентификатором ");


        }
    }

    private static void Task3() {


        String palindrome = "Do geese see God";
        System.out.println(palindrome);
        palindrome = palindrome.replaceAll(" ", "").toLowerCase();
        boolean ispal = true;
        for (int laters = 0; laters < palindrome.length() / 2; laters++) {
            if (!(palindrome.charAt(laters) == palindrome.charAt(palindrome.length() - 1 - laters))) {
                ispal = false;
                break;
            }

        }

        System.out.println("Количество символов: " + palindrome.length());
        System.out.println(ispal ? "Палиндом" : "Не палиндром");
    }

    private static void Task4() {
        System.out.println("Введите строку.");
        Scanner skan = new Scanner(System.in);
        String str = skan.nextLine();

        System.out.println("Введите подстроку для замены.");
        String old = skan.next();
        System.out.println("Введите новую подстроку.");
        String texNew = skan.next();
        str = str.replace(old, texNew);
        System.out.println(str);
    }

    private static void Task5() {

        String number = "";

        String string = "data 48 call 9 read13 blank0a";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                number = number + string.charAt(i) + "";

            }


        }
        System.out.println(number);
    }

    private static void Task6() {
        String simbolsNew = "";
        String simbols = "abc cde def";
        simbols = simbols.replaceAll(" ", "");
        for (int i = 0; i < simbols.length(); i++) {
            if (!simbolsNew.contains(simbols.charAt(i) + "")) {

                simbolsNew = simbolsNew + simbols.charAt(i) + "";
            }
        }
        System.out.println(simbolsNew);
    }

    private static void Task7() {


        String str = " Hgfd   rfd s  tesv ted  fs ";
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            while (str.contains("  ")) {
                str = str.replace("  ", " ");
            }
        }
        System.out.println(str);
    }

    private static void Task8() {
        String resolt = "";
        String str[] = new String[4];
        str[0] = "qwe rty ipdf fd ddfd ";
        str[1] = "qwety uiihf hhf hjkhfgh jhg";
        str[2] = "rt ggf fg bh";
        str[3] = "tyui hj n j jnj";
        for (int i = 0; i < str[1].length(); i++) {
            if (str[0].length() > str[1].length()) {
                resolt = str[0];
            } else resolt = str[1];

            if (resolt.length() < str[2].length()) {
                resolt = str[2];
            }
            if (resolt.length() < str[3].length()) {
                resolt = str[3];
            }


        }

        System.out.println("Самая длинная строка в массиве " + "\n" + resolt);
        System.out.println("Её номер: " + Arrays.asList(str).indexOf(resolt));
    }

    private static void Task9() {

        char spase = ' ';
        String str = "Have a good weekend";
        System.out.println(str);
        String str2 = "";
        int letters = 0, index = 0, maxLet = 0;
        int maxIndex1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != spase) {
                letters++;
            } else {
                if (letters > maxLet) {
                    maxLet = letters;
                    maxIndex1 = i;
                }
                letters = 0;
                index = i + 1;
            }

        }
        str2 = str.substring(index);


        if (str2.length() > maxLet) {
            System.out.println("Самое длинное слово в строке: " + str.substring(index));
            System.out.println("Длинна слова: " + str2.length() + " букв");
        } else {
            System.out.println("Самое длинное слово в строке: " + str.substring(maxIndex1 - maxLet, maxIndex1));
            System.out.println("Длинна слова: " + maxLet + " букв");

        }
    }

    private static void Task11() {
        char spase = ' ';
        int words = 1;
        String str = "I am going to travel round the world";
        System.out.println(str);
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == spase) {
                words++;
            }

        }
        System.out.println("Количество слов: " + words);

    }

    private static void Task10() {
int smallLetters = 0;
int bigLetters = 0;
       String str = "I am going to travel round the world";
        System.out.println(str);
String small = "qwertyuiopasdfghjklzxcvbnm";
String big = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for (int i = 0; i <str.length(); i++) {
            if(small.contains(str.charAt(i)+"")){
                smallLetters++;
            }
            if (big.contains(str.charAt(i)+"")){
                bigLetters++;
            }

        }
        System.out.println("Больших букв: "+bigLetters);
        System.out.println("Маленьких букв: "+smallLetters);
    }


}





