package main;

import java.util.*;
import java.util.function.Predicate;

public class StudentUtils implements StudentFilter, StudentMapper {


    public static void filterStudents(List<Student> students, StudentFilter studentsfilter) {

        for (Student stud : students) {
            System.out.println(studentsfilter.filter(stud));
        }
    }

    public static void mapStudents(List<Student> students, StudentMapper studentsmapper) {
        Map<Integer, String> newMap = new HashMap<>();

        for (Student student : students) {
            Student studObj = studentsmapper.mapper(student);
//            System.out.println(studObj.getName());
            newMap.put(studObj.getId(),studObj.getName());
        }

        newMap.forEach((key, value) -> System.out.println(key + ":" + value));

    }

    @Override
    public boolean filter(Student student) {
        return true;
    }

    @Override
    public Student mapper(Student student) {
        //streamat, if condition ne radi
//        if(student.getAge() > 20){
//            return student;
//        }else {
//            return null;
//        }
        return student;
    }
}
