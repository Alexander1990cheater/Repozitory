package ru.academits.java.average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число из диапазона от 1 до 20");
        double a = Integer.parseInt(scanner.nextLine());
        if (a >= 1 && a <= 20){
            System.out.println("Введите второе число из диапазона от 1 до 20");
            double b = Integer.parseInt(scanner.nextLine());
            if (b >= 1 && b <= 20){
                double average = getAverage(a, b);
                System.out.println("Среднее арифметическое равно " + average);
            }
            else System.out.println("Число должно быть из диапазона от 1 до 20");
        }
        else System.out.println("Число должно быть из диапазона от 1 до 20");
    }
    public static double getAverage(double a, double b) {
        return (a + b)/2;
    }
}
