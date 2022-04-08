package ru.evgrafova;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "101011";
        String b = "100111";
        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
        System.out.println(bins.mult("число", b));
    }
}