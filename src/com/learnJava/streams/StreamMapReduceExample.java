package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    public static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(Student::getNoteBooks)
                .reduce(0, (a,b)->a+b);
    }

    public static void main(String[] args) {

        System.out.println(noOfNoteBooks());
    }
}
