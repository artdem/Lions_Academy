package com.company;

import java.util.ArrayList;
import java.util.List;

public class LionsAcademyTaskOne {

    public int wordsCount(String[] words, int len) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i <= words.length - 1; i++) {
            int charsCount = words[i].length();
            if (charsCount == len) {
                tmp.add(words[i]);
            }
        }
        return tmp.size();
    }
}


