/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management;

/**
 *
 * @author Phuong-Tai
 */
public class Student {
       private static int counter = 0; 
    private int id;
    private String fullName;
    private double GPA;
    private String nganh;

    public Student(int id, String fullName, double GPA, String nganh) {
       this.id = ++counter;
        this.fullName = fullName;
        this.GPA = GPA;
        this.nganh = nganh;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", GPA=" + GPA + ", nganh=" + nganh + '}';
    }
  

}
