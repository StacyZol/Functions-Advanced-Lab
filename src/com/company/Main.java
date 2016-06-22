package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        oddOrEven(6);
        twoWords("Chicken", "Dolphin");
        stopAtW("View");
        randomNumber();
        nextCalendar("21", "8", "1990");
        newWord("Water");
        bigNumber(8);
        twoNumbers(4, 4);
        countryName();
        oneLetter();


    }

    public static boolean oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean twoWords(String str, String str2) {
        if (str.equals(str2)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void stopAtW(String str) {
        String value = "Towel";
        for (int i = 0; i < value.length(); i++) {
            char letter = value.charAt(i);
            System.out.println(letter);
            if (letter == 'w') {
                break;
            }
        }
    }

    //Write a function that generates a random number. Print it out. If the number is greater that 50, return it, otherwise return -1. You may use control flow and multiple conditionals.
    public static int randomNumber() {
        //Random rndNumbers = new Random();
        //for(int i = 0; i < 100; i++) {
        // int rndNumber = rndNumbers.nextInt();
        // System.out.println(rndNumber);
        int rand = (int) (Math.random() * 100);
        System.out.println(rand);
        if (rand > 50) {
            return rand;
        } else {
            System.out.println("-1");
        }
        return rand;
    }

    //Write a function that takes in 3 integers: day, month, and year and computes day, month, and year of the next day. The function should return a string (e.g. day:12 month:11 year:1988)
    public static String nextCalendar(String day, String month, String year) {
        int day2 = Integer.parseInt(day);
        int d = day2 + 1;
        int month2 = Integer.parseInt(month);
        int m = month2 + 1;
        int year2 = Integer.parseInt(year);
        int y = year2 + 1;
        String strd = Integer.toString(d);
        String strm = Integer.toString(m);
        String stry = Integer.toString(y);
        System.out.println("day:" + strd + " month:" + strm + " year:" + stry);
        return strd;
    }

    //Write a function that takes in a word, omits every other letter in that word and returns a new word. You can use control flow and multiple conditionals.
    public static String newWord(String strw) {
        String value = "Encyclopedia";
        for (int i = 1; i < value.length(); i++) {
            char letter = 1;
            if (i % 2 != 0) {
                letter = value.charAt(i);
            }
            System.out.print(letter);
        }
        return value;
    }

    //Write a function that takes in a number greater than 5 and prints out all the numbers from 1 to that number except number 4. Please use a while statement.
    public static void bigNumber(int num) {

        if (num <= 5) {
            System.out.println("");
        } else {
            int i = 0;
            while (i <= num) {
                if (i != 4) {
                    System.out.println(i);
                }
                i++;
            }
        }

    }

    //Write a function that takes in 2 numbers, and checks if they are the same. If they are not the same, it adds 1 to every number and returns its sum. If the numbers are the same, it adds 2 to every number and returns its sum.

    public static int twoNumbers(int a, int b) {
        if ( a == b) {
            return ((a+2)+(b+2));
        }
        else {
            return ((a+1)+(b+1));
            }

        }

//Write a function that asks the user to enter a country domain. If the user types in "us", the function prints out "United States", if the user enters "de", the function prints out "Germany", if the user types in "hu" the response should be "Hungary". In all other cases the function should print out "Unknown". Please try to use a switch statement and make sure the function works with a user's input of lower and upper case strings.
    public static void countryName (){
        System.out.println("Enter a country domain");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();

        switch (userInput) {
            case "us":
                System.out.println("United States");
                break;
            case "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary:");
                break;
            default:
                System.out.println("Unknown");
        }

    }
//Write a function that asks the user to type in a letter and prints out whether the letter is a vowel or a consonant. You may use control flow and multiple conditionals.
    public static void oneLetter () {
        System.out.println("Type in a letter");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if ((userInput.equals( "a")) || (userInput.equals("e")) || (userInput.equals("i")) || (userInput.equals("o")) || (userInput.equals("u"))) {
            System.out.println("That is a vowel!");

        }
        else {
            System.out.println("That is a consonant");

        }
    }


    }





