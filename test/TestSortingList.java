import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSortingList {

    @Test
    public void testArrayBeforeSorting() {
        String[] firstArray = {"Ola","Pola","Lola"};
        String[] secondArray = {"Ola","Pola","Lola"};

        Assertions.assertArrayEquals(firstArray,secondArray);
    }

    @Test
    public void testArrayAfterSorting() {
        String[] firstArray = {"Ola","Pola","Lola"};
        String[] secondArray = {"Ola","Pola","Lola"};

        Arrays.sort(firstArray);

        Assertions.assertNotEquals(firstArray,secondArray);
    }

    @Test
    public void testArrayBeforAndAfterSorting() {

        Student s1 = new Student("Wood", 23, 199, "Alex");
        Student s2 = new Student("Pink", 34, 160, "Jo");
        Student s3 = new Student("Shmit", 18, 179, "Paul");
        Student s4 = new Student("Scott", 54, 184, "Eva");
        Student s5 = new Student("Amber", 43, 182, "Chris");

        List<Student> studentListBefore = new ArrayList<>();

        studentListBefore.add(s1);
        studentListBefore.add(s2);
        studentListBefore.add(s3);
        studentListBefore.add(s4);
        studentListBefore.add(s5);

        List<Student> studentListSecond = new ArrayList<>(studentListBefore);

        Collections.sort(studentListBefore);

        Assertions.assertNotEquals(studentListBefore, studentListSecond);

        Assertions.assertNotEquals(studentListBefore.toArray(),studentListSecond.toArray());

        for (int i = 0; i < studentListBefore.size(); i++) {
            Assertions.assertNotEquals(studentListBefore.get(i), studentListSecond.get(i));
        }

        for (int i = 0; i < studentListBefore.size(); i++) {
            Student before = studentListBefore.get(i);
            Student second = studentListSecond.get(i);
            Assertions.assertNotEquals(before.getLastName(), second.getLastName());
            Assertions.assertNotEquals(before.getAge(), second.getAge());
            Assertions.assertNotEquals(before.getHeight(), second.getHeight());
            Assertions.assertNotEquals(before.getName(), second.getName());
        }

    }

}


//Używając metody Assertions.assertArrayEquals() i jej przeciwieństwa sprawdź,
//czy tablice obiektów są sobie równe przed i po posortowaniu (nie powinny być)

