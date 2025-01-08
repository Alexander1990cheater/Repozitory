package ru.academits.java.person;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private Integer age;

    public Person(String name, String middleName, String familyName, Integer age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя изменено");

        }
        else {
            System.out.println("Имя не менялось");
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
