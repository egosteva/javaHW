package ru.gosteva;

public class Main {
    public static void main(String[] args) {
        // Математические и логические операторы
        int a = 10;
        int b = 5;
        int c = 40;
        int d = 100;
        boolean trueParam = true;
        boolean falseParam = false;
        String stringParam = "Java practice";

        int result1 = (a + b);
        System.out.println("result1 = " + result1);
        int result2 = (a - c);
        System.out.println("result2 = " + result2);
        if (result1 == 15 && result2 == -30) {
            System.out.println("Results are correct");
        } else {
            System.out.println("Mathematics error");
        }

        int result3 = (d / c);
        System.out.println("result3 = " + result3);
        int result4 = (b * d);
        System.out.println("result4 = " + result4);
        int result5 = (d % c);
        System.out.println("result5 = " + result5);
        if (result3 != 2 || result4 != 500 || result5 != 20) {
            System.out.println("Mathematics error");
        } else {
            System.out.println("Results are correct");
        }

        System.out.println("a++   = " + (a++));
        System.out.println("++a   = " + (++a));
        System.out.println("--b   = " + (--b));
        System.out.println("b--   = " + (b--));
        System.out.println("boolean result = " + ((a == 12) && (b == 3)));

        if (stringParam != null && b < a && c >= 40) {
            System.out.println(trueParam);
        } else {
            System.out.println(falseParam);
        }
        falseParam = trueParam;
        if (falseParam = true) {
            trueParam = false;
        }
        System.out.println("trueParam = " + trueParam);
        System.out.println("falseParam = " + falseParam);

        // Переполнение типов данных
        byte bite = 126;
        byte result6 = (byte) (bite + 10);
        if (!(result6 == 136)) {
            System.out.println("Overflow error. Expected result = 136, actual result = " + result6);
        } else {
            System.out.println("No overflow");
        }

        double aDouble = Double.MAX_VALUE;
        double result7 = (double) (aDouble + 0.0001);
        if (result7 - aDouble == 0.0001) {
            System.out.println("No overflow");
        } else {
            System.out.println("Overflow error. Expected result = 0.0001, actual result = " + (result7 - aDouble));
        }

        // Вычисление комбинаций типов данных
        double bDouble = 2.7446956;
        System.out.println("aDouble + a - 2 = " + (bDouble + a - 2));

        double result8 = aDouble - (double) d;
        System.out.println("aDouble - d = " + result8);
        if (result8 + d == aDouble) {
            System.out.println("OK");
        }
    }
}