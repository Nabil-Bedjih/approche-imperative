package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte myByte = 120;
        float myFloat = 3.14f;
        short myShort = 10000;
        double myDouble = 3.14159;
        int myInt = 42;
        boolean myBoolean = true;
        long myLong = 1234567890L;
        char myChar = 'A';
        String myString = "Hello, world!";

        System.out.println("Valeur de myByte : " + myByte);
        System.out.println("Valeur de myFloat : " + myFloat);
        System.out.println("Valeur de myShort : " + myShort);
        System.out.println("Valeur de myDouble : " + myDouble);
        System.out.println("Valeur de myInt : " + myInt);
        System.out.println("Valeur de myBoolean : " + myBoolean);
        System.out.println("Valeur de myLong : " + myLong);
        System.out.println("Valeur de myChar : " + myChar);
        System.out.println("Valeur de myString : " + myString);

        String randomString = " le résultat d’un calcul : 1+5=6\n";
        System.out.println(randomString);
    }
}