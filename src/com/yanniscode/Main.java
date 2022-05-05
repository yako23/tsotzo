package com.yanniscode;
import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        List<Student> students = getStudent();
        System.out.println("Primary List");
        students.forEach(System.out::println);


        List<Student> sortsurname = students.stream()
                .sorted(Comparator.comparing(Student::getSurname))
                .collect(Collectors.toList());
        System.out.println("\nSorted List by Surname");
        sortsurname.forEach(System.out::println);
        //sort by Age
        List<Student> sorthlikia = students.stream()
                .sorted(Comparator.comparing(Student::getHmernia).reversed())
                .collect(Collectors.toList());
        System.out.println("\nSorted List by Age");
        sorthlikia.forEach(System.out::println);

        //sort by Varos
        List<Student> sorted = students.stream()
                .sorted(Comparator.comparing(Student::getVaros).reversed())
                .collect(Collectors.toList());
        System.out.println("\nSorted List by Varos");
        sorted.forEach(System.out::println);

        //sort by Ypsos
        List<Student> sortypsos = students.stream()
                .sorted(Comparator.comparing(Student::getYpsos))
                .collect(Collectors.toList());
        System.out.println("\nSorted List by Ypsos");
        sortypsos.forEach(System.out::println);

    }

    private  static List<Student> getStudent(){
        return List.of(
                new Student("Koutras", "Yannis",71,1.77, "1988-09-27"),
                new Student("Makridis", "Nikos",101, 1.80,"1996-02-08"),
                new Student("Zairi", "Maria",57, 1.57, "1990-07-16"),
                new Student("Alexandrou", "Kyriakos", 83,1.74, "1994-01-02"),
                new Student("Gewrgiou", "Mixalis", 91,1.83,"1955-07-28"),
                new Student("Kaza", "Eleni", 45,1.64,"1986-01-31"),
                new Student("Mosxoviti", "Dimitra", 63,1.60,"1978-10-20"),
                new Student("Mantalos", "Petros", 91,2.01,"1988-05-05"),
                new Student("Gianniwti", "Anastasia", 50,1.70,"1986-03-13"),
                new Student("Ampelale", "Dimitra", 83,1.82,"1986-12-31")
        );
    }

    }

