
public class Student implements Comparable<Student> {
    private String lastName;
    private int age;
    private int height;
    private String name;

    public Student(String lastName, int age, int height, String name) {
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public void sortingMet() {

    }
}




// Sortowanie listy: Stwórz klasę Student z polami: DONE
// age, height, name, lastName. DONE
// Zaimplementuj interfejs Comparable, DONE
// w taki sposób, aby głównym kryterium było nazwisko, drugim wiek. lastName i age
// Stwórz listę 5 obiektów i użyj metody sort.
// Lista przed powinna się różnic od listy po.