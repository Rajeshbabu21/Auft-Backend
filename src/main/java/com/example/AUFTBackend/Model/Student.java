package com.example.AUFTBackend.Model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @SequenceGenerator(name = "sq_name",sequenceName = "sq_name",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sq_name")
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
