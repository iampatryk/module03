import LibraryTask.Author;
import LibraryTask.Book;
import java.util.*;

public class Main {
    public static void main(String[] args) {

            Map<Author, List<Book>> authorListMap = new HashMap<>();
            Author a1 = new Author("Ksiazka Jeden",23,"jeden");
            Book b1 = new Book("asddasd","dasdad",1233);
            Book b2 = new Book("asddasdasdasd","dasdasddad",133);
            Book b3 = new Book("asddaasdasdsd","dasdddaddad",33);
            List<Book> books = new ArrayList<>();
            books.add(b1);
            books.add(b2);
            books.add(b3);

            authorListMap.put(a1,books);
            System.out.println(authorListMap.size());

            System.out.println(authorListMap.get(a1));

            List<Book> tmp = authorListMap.get(a1);
            tmp.add(new Book("ksiazka","adfd",1333));
            authorListMap.put(a1,tmp);



//        Student s1 = new Student("Wood",23,199,"Alex");
//        Student s2 = new Student("Pink",34,160,"Jo");
//        Student s3 = new Student("Shmit",18,179,"Paul");
//        Student s4 = new Student("Scott",54,184,"Eva");
//        Student s5 = new Student("Amber",43,182,"Chris");
//
//        List<Student> studentList = new ArrayList<>();
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);
//        studentList.add(s5);
//
//        System.out.println("Print List");
//
//        for(Student student : studentList) {
//            System.out.println(student);
//        }
//
//        System.out.println("After default sorting");
//
//        Collections.sort(studentList);
//
//        for(Student student : studentList) {
//            System.out.println(student);
//        }
//
//        System.out.println("After sorting by lastName");
//
//        StudentLastNameComparator comparator = new StudentLastNameComparator();
//        Collections.sort(studentList, comparator);
//
//        for(Student student : studentList) {
//            System.out.println(student);
//        }







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








//        CountWords myCunter = new CountWords();
//        myCunter.wordCounter();









//        String text1 = "But all I must explain to you all how all this mistaken idea of denouncing pleasure and all praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness all. No one rejects, dislikes, or all avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because all it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it?";
//        String word = "all";
//
//        HashMap<String, Integer> map = CountWords.countWords(text1);
//
//        int numberWord = map.getOrDefault(word,0);
//        System.out.println("Word: " + word + " it's use " + numberWord + " times.");



    }

//    private static HashMap<String, Integer> countWords(String tekst) {
//        return null;
//    }
}
