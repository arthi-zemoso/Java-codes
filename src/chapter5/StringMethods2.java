package chapter5;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String name1="John Baugh";
        String upper=name1.toUpperCase();
        String lower=name1.toLowerCase();
        int ind= name1.indexOf('B');
        String lName=name1.substring(5);
        System.out.println("upper is "+upper);
        System.out.println("lower is "+lower);
        System.out.println("B is at "+ind);
        System.out.println("last name is "+ lName);
    }
}
