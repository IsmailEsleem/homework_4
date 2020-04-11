/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication158;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author hp15 ac
 */
public class Q3 {

    public static void main(String[] args) {

        List<student> stu = new ArrayList<student>();

        stu.add(new student(83, "ismail", "aaa", 85));
        stu.add(new student(24, "mohammed", "bbb", 90));
        stu.add(new student(7, "hammam", "ccc", 21.50));
        stu.add(new student(77, "salim  ", "ddd", 11.99));
        stu.add(new student(39, "Eid", "eee", 79.50));
        stu.add(new student(68, "Mahmmoud", "fff", 6.99));
        stu.add(new student(56, "Omar", "ggg", 11.00));
        stu.add(new student(3, "Abed", "hhh", 7.50));

        //Print original invoice
        System.out.println("Original Invoices:");
        student.printHeader();
        stu.stream()
             .forEach((student) -> System.out.println(student));

        //Comparator to sort the student by name
        Comparator<student> descriptionComparator = (aname, bname)
             -> aname.getName().compareTo(bname.getName());

        // sort the student objects by PartDescription , then display the results
        System.out.println("\nAfter Sorting by description:");
        student.printHeader();
        stu
             .stream()
             .sorted(descriptionComparator)
             .forEach((student) -> System.out.println(student));

        //Comparator that compares by grade
        Comparator<student> gradeComparator = (a, b)
             -> new Double(a.getGeade()).compareTo(new Double(b.getGeade()));

        //Map each student to its name and grade and then sorts the
        //results by grade then display the results
        System.out.println("\nMapping invoice to part name and grade then sorting results by grade: \n"
             + String.format("%-30s %-8s", "name", "grade"));
        stu
             .stream()
             .sorted(gradeComparator)
             .map(students -> String.format("%-30s %-8s", students.getName(), students.getGeade()))
             .forEach((students) -> System.out.println(students));

        //comparator that compares grade	
        Comparator<student> printgrade = (a, b)
             -> new Double(a.getGeade()).compareTo(new Double(b.getGeade()));

        // map each student to its name and the grade of the
        //grade between 80-90. Order the results by  name.
        System.out.println("\nMapping each student to name and grade, the sorting by grade: \n"
             + String.format("%-30s %-8s", "name", "grade"));
        stu
             .stream()
             .sorted(printgrade)
             .map(students -> String.format("%-30s %-8s", students.getName(), students.getGeade()))
             .forEach((students) -> System.out.println(students));

        //Predicate to set range of values
        Predicate<student> range = students -> (students.getGeade() >= 80 && students.getGeade() <= 90);

        //Printing students whose 80-90
        System.out.println("\nSelecting only students between 80 to 90 ordered by students : \n"
             + String.format("%-30s %-8s", "name", "grade"));
        stu
             .stream()
             .filter(range)
             .sorted(printgrade)
             .map(students -> String.format("%-30s %-8s", students.getName(), students.getGeade()))
             .forEach((students) -> System.out.println(students));

        // groping by major 
        Map<String, List<student>> studentMap
             = stu.stream().collect(Collectors.groupingBy(student::getMajor));
        
        System.out.println("Student grouped by Major");

//        studentMap.forEach((key, List < student> empList
//            ) -> {
//        System.out.println(key + " -> " + empList);
//        });
    }

}


