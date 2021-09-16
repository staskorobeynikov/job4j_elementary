package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    private static void hello(String name, String name1, String name2) {
        System.out.println("Hello, " + name);
        System.out.println("Hello, " + name1);
        System.out.println("Hello, " + name2);
    }

    private static void hello(int age) {
        System.out.println("I'm " + age + " years old.");
    }

    private static void hello(String name, int age) {
        System.out.println("Hello, " + name + ". I'm " + age + " years old.");
    }

    private static void hello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        String name = "Stas Korobeynikov";
        int age = 32;

        ArgMethod.hello(name);

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }
}
