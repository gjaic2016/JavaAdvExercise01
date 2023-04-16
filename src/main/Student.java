package main;

public class Student {

    Integer id;

    String name;

    Integer age;

    double gpa;

    boolean isStudent;

    public Student(Integer id, String name, Integer age, double gpa, boolean isStudent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isStudent = isStudent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
