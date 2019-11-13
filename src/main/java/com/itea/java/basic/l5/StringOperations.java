package com.itea.java.basic.l5;

public class StringOperations {

    public static void main(String[] args) {
        System.out.println(reverse("Hello my name is (help me) Java"));
    }

    private static String reverse(String s) {
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//            result += s.charAt(s.length() - 1 - i);
//        }
//        return result;
        StringBuilder sb = new StringBuilder("Hello my name is (help me) Java");
        return sb.reverse().toString();
    }

    private static String extractFromCurls(String s) {
        int startIndex = s.indexOf('(') + 1;
        int endIndex = s.indexOf(')');
        return s.substring(startIndex, endIndex);
    }

    private static boolean isPalindrom(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsOnlyDigits(String s) {
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
