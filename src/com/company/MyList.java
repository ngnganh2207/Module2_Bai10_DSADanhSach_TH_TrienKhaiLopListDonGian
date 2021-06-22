package com.company;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;// Số phần tử trong ds, mặc định =0;
    private static final int DEFAULT_CAPACITY = 10;// số pt max trong ds, mặc định 10
    private Object elements[];// Mảng đối tượng chứa các phần tử trong ds

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
