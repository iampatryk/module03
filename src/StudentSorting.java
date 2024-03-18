import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorting {


    public static void studentSortBefore() {

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
    }

    public static void studentSortAfterDefaultSorting() {

        Student s1 = new Student("Wood", 23, 199, "Alex");
        Student s2 = new Student("Pink", 34, 160, "Jo");
        Student s3 = new Student("Shmit", 18, 179, "Paul");
        Student s4 = new Student("Scott", 54, 184, "Eva");
        Student s5 = new Student("Amber", 43, 182, "Chris");

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Collections.sort(studentList);

        System.out.println("Print List After Default Sorting");

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void studentSortAfterSortingByLastName() {

        Student s1 = new Student("Wood", 23, 199, "Alex");
        Student s2 = new Student("Pink", 34, 160, "Jo");
        Student s3 = new Student("Shmit", 18, 179, "Paul");
        Student s4 = new Student("Scott", 54, 184, "Eva");
        Student s5 = new Student("Amber", 43, 182, "Chris");

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        StudentLastNameComparator comparator = new StudentLastNameComparator();
        Collections.sort(studentList, comparator);

        System.out.println("Print List After Sorting By Last Name");

        for (Student student : studentList) {
            System.out.println(student);
        }

    }

}
