package com.itea.java.basic.l5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        printLongestAndShortest();
        sortLines();
    }

    private static void sortLines() {
        String[] lines = inputLinesArray();
        sortByLengthAscending(lines);
        System.out.println(Arrays.toString(lines));
    }

    private static void printLongestAndShortest() {
        String[] lines = inputLinesArray();
        System.out.println(shortest(lines));
        System.out.println(longest(lines));
    }

    private static String[] inputLinesArray() {
        System.out.print("Please enter n: ");
        int n = SCANNER.nextInt();
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter the line #" + (i + 1) + " ");
            lines[i] = SCANNER.next();
        }
        return lines;
    }

    private static void sortByLengthAscending(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines.length; j++) {
                if (lines[i].length() < lines[j].length()) {
                    String tmp = lines[i];
                    lines[i] = lines[j];
                    lines[j] = tmp;
                }
            }
        }
    }

    private static String shortest(String[] lines) {
        int currentMin = 0;
        for (int i = 1; i < lines.length; i++) {
            if (lines[i].length() < lines[currentMin].length()) {
                currentMin = i;
            }
        }
        return lines[currentMin];
    }

    private static String longest(String[] lines) {
        int currentMax = 0;
        for (int i = 1; i < lines.length; i++) {
            if (lines[i].length() > lines[currentMax].length()) {
                currentMax = i;
            }
        }
        return lines[currentMax];
    }
}
