package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Pero", 33, 4.3, true));
        students.add(new Student(2, "Ivo", 22, 2.5, false));
        students.add(new Student(3, "Mrva", 25, 3.3, true));
        students.add(new Student(4, "Grga", 18, 4.1, false));
        students.add(new Student(5, "", 22, 3.1, false));


//        StudentFilter filter = s -> s.isStudent;
//        StudentFilter filter = s -> s.getName().isEmpty();

        StudentUtils.filterStudents(students, student -> student.isStudent);
//        StudentUtils.filterStudents(students, filter);



//      ????????????????????????????
        StudentMapper mapper =  s -> s;
//        ne ide
//        StudentMapper mapper =  s -> s.getName();
//        StudentMapper mapper =  (k,v) -> ??????;

        StudentUtils.mapStudents(students, mapper);


    }
}

