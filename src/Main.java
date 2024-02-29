import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Wood",23,199,"Alex");
        Student s2 = new Student("Pink",34,160,"Jo");
        Student s3 = new Student("Shmit",18,179,"Paul");
        Student s4 = new Student("Scott",54,184,"Eva");
        Student s5 = new Student("Amber",43,182,"Chris");

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("Print List");

        for(Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("After default sorting");

        Collections.sort(studentList);

        for(Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("After sorting by lastName");

        StudentLastNameComparator comparator = new StudentLastNameComparator();
        Collections.sort(studentList, comparator);

        for(Student student : studentList) {
            System.out.println(student);
        }

//        SummingTheArray mySumArr = new SummingTheArray();
//        mySumArr.sumaTablicy();

//        TodoList myTodoList = new TodoList();
//        myTodoList.add("Task 1");
//        myTodoList.add("Task 123");
//        myTodoList.add("Task 233");
//        myTodoList.add("Task 233");
//        myTodoList.add("Task 233asdd");
//        myTodoList.remove(3);
//        myTodoList.remove(3);
//        myTodoList.print();

    }
}
