package com.company.test;

import com.company.LionsAcademyTaskOne;

import com.company.LionsAcademyTaskThree;
import com.company.LionsAcademyTaskTwo;
import junit.framework.Assert;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class Test {

    @org.junit.Test
    public void testWordsCount() {
        LionsAcademyTaskOne lionsAcademyTaskOne = new LionsAcademyTaskOne();

        //given
        String[] listOfStrings1 = {"a", "bb", "b", "ccc"};
        int i = 1;

        //when
        int result = lionsAcademyTaskOne.wordsCount(listOfStrings1, i);

        //then
        assertTrue(2 == result);

    }

    @org.junit.Test
    public void testWordsCount2() {
        LionsAcademyTaskOne lionsAcademyTaskOne = new LionsAcademyTaskOne();

        //given
        String[] listOfStrings1 = {"a", "bb", "b", "ccc"};
        int i = 3;

        //when
        int result = lionsAcademyTaskOne.wordsCount(listOfStrings1, i);

        //then
        assertTrue(1 == result);

    }

    @org.junit.Test
    public void testWordsCount3() {
        LionsAcademyTaskOne lionsAcademyTaskOne = new LionsAcademyTaskOne();

        //given
        String[] listOfStrings1 = {"a", "bb", "b", "ccc"};
        int i = 4;

        //when
        int result = lionsAcademyTaskOne.wordsCount(listOfStrings1, i);

        //then
        assertTrue(0 == result);

    }

    @org.junit.Test
    public void testWordsFront() {
        LionsAcademyTaskTwo lionsAcademyTaskTwo = new LionsAcademyTaskTwo();

        //given
        String[] listOfStrings2 = {"a", "b", "c", "d"};
        int j = 1;

        //when
        String[] result = lionsAcademyTaskTwo.wordsFront(listOfStrings2, j);

        //then
        String[] expectedResult = {"a"};
        assertArrayEquals(expectedResult, result);
    }

    @org.junit.Test
    public void testWordsFront2() {
        LionsAcademyTaskTwo lionsAcademyTaskTwo = new LionsAcademyTaskTwo();

        //given
        String[] listOfStrings2 = {"a", "b", "c", "d"};
        int j = 2;

        //when
        String[] result = lionsAcademyTaskTwo.wordsFront(listOfStrings2, j);

        //then
        String[] expectedResult = {"a", "b"};
        assertArrayEquals(expectedResult, result);
    }

    @org.junit.Test
    public void testWordsFront3() {
        LionsAcademyTaskTwo lionsAcademyTaskTwo = new LionsAcademyTaskTwo();

        //given
        String[] listOfStrings2 = {"a", "b", "c", "d"};
        int j = 3;

        //when
        String[] result = lionsAcademyTaskTwo.wordsFront(listOfStrings2, j);

        //then
        String[] expectedResult = {"a", "b", "c"};
        assertArrayEquals(expectedResult, result);
    }

    @org.junit.Test
    public void testGreenTicket() {
        LionsAcademyTaskThree lionsAcademyTaskThree = new LionsAcademyTaskThree();

        //given
        int a = 1;
        int b = 2;
        int c = 3;

        //when
        int result = lionsAcademyTaskThree.greenTicket(a, b, c);

        //then
        assertTrue(result == 0);

    }

    @org.junit.Test
    public void testGreenTicket2() {
        LionsAcademyTaskThree lionsAcademyTaskThree = new LionsAcademyTaskThree();

        //given
        int a = 2;
        int b = 2;
        int c = 2;

        //when
        int result = lionsAcademyTaskThree.greenTicket(a, b, c);

        //then
        assertTrue(result == 20);

    }

    @org.junit.Test
    public void testGreenTicket3() {
        LionsAcademyTaskThree lionsAcademyTaskThree = new LionsAcademyTaskThree();

        //given
        int a = 1;
        int b = 1;
        int c = 2;

        //when
        int result = lionsAcademyTaskThree.greenTicket(a, b, c);

        //then
        assertTrue(result == 10);

    }

}
