package com.itea.java.basic.l5;

import java.util.Arrays;

public class Sandbox {

    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass("Anton");

        System.out.println(myClass1);
        System.out.println(myClass2);

        int i = 12;
        byte b = 14;
        double d = 11.1113;

        String dString = "" + d;

        String iStr = String.valueOf(i); // "12"
        String bStr = String.valueOf(b); // "14"

        String s = "125";
        int sInt = Integer.parseInt(s);
        Byte.parseByte(s);

    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
