package com.deloitte.lab09.ex04;

import java.util.function.Supplier;

public class MethodRefDemo {

	 public static Person createPerson(String name, int age) {
	        return new Person(name, age);
	    }

	    public static void main(String[] args) {

	        Supplier<Person> personSupplier = () -> createPerson("Soham", 24);
	        Person person = personSupplier.get();

	        person.display();
	    }
	
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
