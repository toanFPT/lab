package com.mycompany.student_management;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Student_management {

    private List<Student> students = new ArrayList<>();

    public boolean addStudent(int id, String fullName, double GPA, String nganh) {

        students.add(new Student(id, fullName, GPA, nganh));
        System.out.println("them thanh cong");
        return true;

    }

    public void displayALL() {
        if (students.isEmpty()) {
            System.out.println("khong ton tai");
        } else {
            System.out.println("id | fullname | GPA | nganh");
    students.forEach(System.out::println);
        }
    }

    public Student searchById(int id) {
        for (Student c : students) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void rankStudent() {
        for (Student s : students) {
           if(s.getGPA()>=5.00){
               System.out.println(s.getFullName()+"pass mon");
           }else{
               System.out.println(s.getFullName()+"fail mon");
           }
            
        }
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(c -> c.getId() == id);
    }

}
//Xuất sắc
//3.60 – 4.00
// Giỏi
// 3.20 – 3.59
//Khá
// 2.50 – 3.19
//Trung bình
// 2.00 – 2.49
// Yếu
// dưới 2.00
//          
