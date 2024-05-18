package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = 5, z = 6;

        printName();
        printName("Test");

        byte b = 127;

        int sum = x + y;

        String firstName = "Miro";
        String lastName = "Petrov";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(sum);


    }
    public static void printName () {
        System.out.println("Miro");
    }

    public static void printName (String name) {
        System.out.println(name);
    }
}