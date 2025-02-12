/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author PC
 */
import java.util.Arrays;

public class Student {
    String name;
    String classs;
    int score;
    Student[] data;
    int n;

    public Student() {
        this.n = 0;
        this.data = new Student[0]; // Khởi tạo mảng rỗng ban đầu
    }

    public Student(String name, String classs, int score) {
        this.name = name;
        this.classs = classs;
        this.score = score;
    }

    public void initializeArray() {
        data = new Student[3];
        data[0] = new Student("A", "1", 2);
        data[1] = new Student("B", "2", 7);
        data[2] = new Student("C", "3", 5);
        n = 3;
    }

    public void addX(Student x) {
        data = Arrays.copyOf(data, n + 1); // Tạo mảng mới với kích thước tăng 1
        data[n] = x;
        n++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student List:\n");
        for (int i = 0; i < n; i++) {
            sb.append("Name: ").append(data[i].name)
              .append(", Class: ").append(data[i].classs)
              .append(", Score: ").append(data[i].score)
              .append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.initializeArray();
        a.addX(new Student("D", "3", 5));
        System.out.println(a.toString());
    }
}

