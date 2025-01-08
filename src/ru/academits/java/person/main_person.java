package ru.academits.java.person;

import java.util.Scanner;
import ru.academits.java.person.Person;

public class main_person {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("введите имя: ");
//        String name = scanner.nextLine();
//
//        System.out.print("введите отчество: ");
//        String middleName = scanner.nextLine();
//
//        System.out.print("введите фамилию: ");
//        String familyName = scanner.nextLine();

        String name = "Александр";
        String middleName = "Владимирович";
        String familyName = "Мейснер";
        Integer age = 34;


        Person person = new Person(name, middleName, familyName, age);
        System.out.println("Первоначальное имя = " + person.getName());
        person.setName("");
        System.out.println("Текущее имя " + person.getName());
        System.out.println("Возраст человека " + age);
    }
}
