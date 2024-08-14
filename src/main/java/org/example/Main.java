package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    private static final List<Integer> nums =
            new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 5, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "abc", "bcb", "bcb", "e"));

    public static void main(String[] args) {
        task1();
        System.out.println("Homework19_2");
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            //if (num % 2 = 0 && num != prevNum) {
            System.out.println(num);
            prevNum = num;
        }
    }
    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    public static void task4() {
        Set<String>uniqueWords = new HashSet<>(words);
        System.out.println(words.size()- uniqueWords.size());
    }
}
