package com.company;

public class Main {

    public static void main(String[] args) {

// Zadanie 1:

        LionsAcademyTaskOne lionsAcademyTaskOne = new LionsAcademyTaskOne();
        String[] listOfStrings1 = {"a", "bb", "b", "ccc"};

        System.out.println(lionsAcademyTaskOne.wordsCount(listOfStrings1, 1));
        System.out.println("\n========================================================================================\n");

// Zadanie 2:

        LionsAcademyTaskTwo lionsAcademyTaskTwo = new LionsAcademyTaskTwo();
        String[] listOfStrings2 = {"a", "b", "c", "d"};
        String[] wordsFrontListOfStrings = lionsAcademyTaskTwo.wordsFront(listOfStrings2, 4);

        if (wordsFrontListOfStrings != null) {
            for (String i : wordsFrontListOfStrings) {
                System.out.println(i);
            }
        } else {
            System.out.println("Table is empty.");
        }
        System.out.println("\n========================================================================================\n");

// Zadanie 3:

        LionsAcademyTaskThree lionsAcademyTaskThree = new LionsAcademyTaskThree();

        System.out.println(lionsAcademyTaskThree.greenTicket(2, 42, 42));

    }
}
