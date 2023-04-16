package main;

@FunctionalInterface
public interface StudentFilter {

    boolean filter(Student student);
}
