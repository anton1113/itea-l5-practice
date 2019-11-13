package com.itea.java.basic.l5.hw;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author
 */
public class MyStringBuilder {

    private char[] value;

    public MyStringBuilder(String value) {
        this.value = value.toCharArray();
    }

    public MyStringBuilder append(String s) {
        throw new NotImplementedException();
    }

    public MyStringBuilder reverse() {
        throw new NotImplementedException();
    }

    public String toString() {
        throw new NotImplementedException();
    }
}
