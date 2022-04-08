package ru.evgrafova;

public class BinOps {

    public String sum(String a, String b) {
        try {
            int aInt = Integer.parseInt(a, 2);
            int bInt = Integer.parseInt(b, 2);
            return Integer.toBinaryString(aInt + bInt);
        } catch (NumberFormatException e) {
            return "Введено не двоичное число!";
        }
    }

    public String mult(String a, String b) {
        try {
            int aInt = Integer.parseInt(a, 2);
            int bInt = Integer.parseInt(b, 2);
            return Integer.toBinaryString(aInt * bInt);
        } catch (NumberFormatException e) {
            return "Введено не двоичное число!";
        }
    }
}