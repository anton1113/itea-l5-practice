package com.itea.java.basic.l5.hw;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author
 */
public class MyString {

    private char[] value;

    public MyString(String value) {
        this.value = value.toCharArray();
    }

    public MyString concat(MyString another) {
        throw new NotImplementedException();
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
}
