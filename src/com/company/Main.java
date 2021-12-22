package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // PART 1
        String fName = "Darth";
        String lName = "Vader";
        int birthYear = 1967;
        String homeWorld = "Tatooine";
        double height = 6.7;
        double weight = 264.55;

        // PART 2
        double purse = 150.0;
        System.out.println("You walk into Mubo’s Droid Depot to buy a droid. The cost is 24.3.");
        purse -= 24.3;
        System.out.println("Next, you walk into Dok-Ondar’s Den of Antiquities. You purchase a very fine set of boots that cost you a flat 45 credits.");
        purse -= 45;
        System.out.println("As you move around in the Black Spire Outpost you hear some noise down an alley. A group of Jedi are playing dice. You play a few rounds and double the credits in your purse.");
        purse *= 2;
        System.out.println("With your purse bursting at the seams you walk into Savi’s Lightsabers. You inquire about a rare lightsabre, and the cashier says he will give it to you for one tenth of all the credits in your pocket.");
        purse = purse - (purse * .10);
        System.out.println(purse);

        System.out.println();
        System.out.println();
        printHello();
        printName("Natalie");
        System.out.println(add(3,7));
        System.out.println(faveColorFinder("green"));
        System.out.println(thatsOdd(7));
        List<Integer> nums = new ArrayList<>(Arrays.asList(7,5,100,200,230,10));
        System.out.println(bigOrSmall(nums));

    }

    // Part 4
    private static void fizzBuzz100() {
        // loop 100 times
        for (int i = 1; i <= 100; i++) {
            // divisible by 3 print fizz
            if ((i % 3) == 0) System.out.println("fizz");
                // divisible by 5 print buzz
            else if ((i % 5) == 0) System.out.println("buzz");
                // divisble by 5 & 3 print fizzbuzz
            else if (((i % 5) == 0) && ((i % 3) == 0)) System.out.println("fizzbuzz");
                // not divisble by 5 or 3 print the number
            else System.out.println(i);
        }
    }

    // Part 5
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void printName(String name) {
        System.out.printf("Hell0, %s%n", name);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String faveColorFinder(String color) {
        if (color.equals("red")) {
            return "red is a great color";
        } else if (color.equals("green")) {
            return "green is a solid favorite color";
        } else if (color.equals("black")){
            return "so trendy";
        } else {
            return "you need to evaluate your favorite color choice";
        }
    }

    public static String thatsOdd(int num){
        if (num % 2 == 0){
            return "That’s not odd!";
        } else {
            return "That is odd indeed!";
        }
    }

    public static List<String> bigOrSmall(List<Integer> arr){
        List<String> answers = new ArrayList<>();

        for (Integer num: arr){
            if (num > 100){
                answers.add("big");
            } else {
                answers.add("small");
            }
        }
        return answers;
    }


}
