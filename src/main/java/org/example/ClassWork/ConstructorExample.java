package org.example.ClassWork;
public class ConstructorExample {
    public static void main(String[] args) {
        Person person1 = new Person("john", 25);
        person1.printPerson();
    }
}

class Person {
    String name;
    int age;

    // constructor method
    Person() {
        System.out.println("Constructor called");
    }

    // constructor with parameters (parameterized constructor)
    Person(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}