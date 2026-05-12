package com.example.miniproject03.Model;

public class Student {
    int id;
    String name;  // ✅ String
    int age;

    // ✅ Constructor — values assign karo
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {  // ✅ String return
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}