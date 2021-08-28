package com.example.more_concepts;

public class StaticKeyword {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(25,"Red");
        TestClass.name = "Michael";
        //altenatively
        //TestClass.setName("Michael");

        System.out.println("Name "+testClass.getName());

        TestClass secondTestClass = new TestClass(20,"Black");
        System.out.println(secondTestClass.name);

        TestClass.printSomething();
    }
}
