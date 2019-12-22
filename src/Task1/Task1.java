package Task1;

/*
Created by Aigerim 22.12.2019
 */

public class Task1 {
    public static void main(String[] args) {
        byte p = -5;
        short s = 10;
        int j = 358;
        long v = 45246865434684L;
        float m = 1.2356988f;
        double n = 54.58434984159841842;
        char k = '\u263a';
        boolean val = false;
        System.out.println(calculation(5, 1, 9, 3));
        System.out.println(task10and20(6, 19));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-9));
        printHello("Айгерим");
        leapYear(700);
    }

    public static int calculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int f, int g) {
        int h = f + g;
        return h >= 10 && h <= 20;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("x - положительное число");
        } else {
            System.out.println("x - отрицательное число");
        }
    }

    public static boolean isNegative(int z) {
        return z < 0;
    }

    public static void printHello(String name) {
        System.out.printf("Привет, %s! \n", name);
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - не високосный");
        }
    }
}
