package com.sist.main;

interface Printable {
    //String toner;
    abstract void print();
}

public class PrintableTest implements Printable {
    public static void main(String[] args) {
        //new Printable();
        new PrintableTest();
    }

    public void print() {}
}
