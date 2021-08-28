package com.example.more_concepts;

public class Inner {
    private int age;
    private String color;

    private class InnerClass{
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age is "+age);
        }
    }

}
