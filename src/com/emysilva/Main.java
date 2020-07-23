package com.emysilva;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 21));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 8 || hourOfDay > 22) {
            barking = true;
            return barking;
        }
        barking = false;
        return barking;
    }
}
