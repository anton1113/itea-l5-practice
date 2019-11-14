package com.itea.java.basic.l5.hw;

/**
 * HomeworkRunner - класс, с помощью которого мы протестируем наше приложение.
 * Он будет содержать набор static методов для тестирования MyString и main метод для входа в програму.
 */
public class HomeworkRunner {

    public static void main(String[] args) {
        testConcat();
    }

    private static void testConcat() {
        MyString hello = new MyString("Hello");
        MyString world = new MyString(" World");
        MyString helloWorld = hello.concat(world);

        String expectedResult = "Hello World";
        if (!expectedResult.equals(helloWorld.toString())) {
            System.out.println("MyString concat test failed!");
        } else {
            System.out.println("MyString concat test success!");
        }
    }
}
