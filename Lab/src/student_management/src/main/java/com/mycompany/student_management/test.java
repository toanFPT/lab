package com.mycompany.student_management;

public class test {
    public static void main(String[] args) {
        Student_management cs = new Student_management();
        cs.addStudent(1, "toan", 3.5, "cntt");
        cs.addStudent(2, "tien", 3.3, "kte");
        cs.addStudent(2, "ti", 4.0, "kte");
        cs.displayALL();



//        int deleteId = 1;
//        boolean isDeleted = manager.deleteStudent(deleteId);
//        if (isDeleted) {
//            System.out.println("Xóa thành công sinh viên có ID = " + deleteId);
//        } else {
//            System.out.println("Không tìm thấy sinh viên để xóa.");
//        }
//    }
    }  
}
