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
    private static final List<String> words = new ArrayList<>
            (List.of("один", "два", "два", "три", "три", "три"));


    public static void main(String[] args) {
        task4();
        System.out.println("Homework19_2");
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println("напечатать только нечетные числа " + num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println("напечатать только четные числа без повторений в порядке возрастания - " + num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("все уникальные слова из списка слов " + uniqueWords);
    }


    public static void task4() {

        Map<String, Integer> words1;
        words1 = new HashMap<>();
        for (String words : words) {
            if (!words1.containsKey(words)) {
                  words1.put(words, 1);
                } else {
                words1.put(words, words1.get(words) + 1);
                System.out.println(" количество дублей для каждого уникального слова " + words1);
            }
        }
    }
}














