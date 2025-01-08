package ru.academits.java;

public class For {
    public static void main(String[] args) {
        for (int i = 100; i >=1; --i){
            int mult = multiplicity(i);
            if (mult != 0){
                System.out.print(mult + " ");
            }
        }
    }

    public static int multiplicity(int i){
        if (i % 4 == 0) {
            return i;
        }
        return 0;
    }

}
