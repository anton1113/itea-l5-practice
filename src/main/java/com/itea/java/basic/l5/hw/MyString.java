package com.itea.java.basic.l5.hw;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * MyString - это класс, с помощью которого мы будем моделировать строку.
 * Он не будет содержать main метода.
 */
public class MyString {

    private char[] value;

    public MyString(String value) {
        this.value = value.toCharArray();
    }

    public MyString(char[] value) {
        this.value = value;
    }

    public MyString concat(MyString another) {
        char[] newValue = new char[value.length + another.value.length];
        for (int i = 0; i < value.length; i++) {
            newValue[i] = value[i];
        }
        for (int i = 0; i < another.value.length; i++) {
            newValue[value.length + i] = another.value[i];
        }
        return new MyString(newValue);
    }

    public char charAt(int index) {
        throw new NotImplementedException();
    }

    public MyString substring(int beginIndex) {
        throw new NotImplementedException();
    }

    public MyString substring(int beginIndex, int endIndex) {
        throw new NotImplementedException();
    }

    public boolean equals(MyString another) {
        throw new NotImplementedException();
    }

    public boolean equalsIgnoreCase(MyString another) {
        throw new NotImplementedException();
    }

    public MyString toUpperCase() {
        throw new NotImplementedException();
    }

    public MyString toLowerCase() {
        throw new NotImplementedException();
    }

    public int indexOf(MyString substring) {
        throw new NotImplementedException();
    }

    public int lastIndexOf(MyString substring) {
        throw new NotImplementedException();
    }

    public MyString replace(MyString oldSubstring, MyString newSubstring) {
        throw new NotImplementedException();
    }

    public MyString replaceAll(MyString oldSubstring, MyString newSubstring) {
        throw new NotImplementedException();
    }

    public String toString() {
        return new String(value);
    }
}
