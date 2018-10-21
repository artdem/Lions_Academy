package com.company;

public class LionsAcademyTaskTwo {

    public String[] wordsFront(String[] words, int n) {
        String[] newListOfStrings = new String[n];
        if (n <= words.length) {
            for (int i = 0; i <= n - 1; i++) {
                newListOfStrings[i] = words[i];
            }
            return newListOfStrings;
        } else {
            return null;
        }
    }

}
