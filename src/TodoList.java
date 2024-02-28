import java.util.ArrayList;

public class TodoList {
    // nie jestem pewny czy w tym miejscu ma byc lista ?
    ArrayList<String> todoList = new ArrayList<>();
    public void add(String task) {
    //Dodaj zadanie do listy
        //dodajemy add(tu jest string czyli poprostu bedziemy wpisywac)
        todoList.add(task);
    }

    public void print() {
    //Wydrukuj zadania z listy wraz z ich numerem na liście
        //petla ktora przejrzy wszystko co jest w ArrayList
        for (int i = 0; i < todoList.size(); i++) {
            //drukuje i = 0 + 1 zeby zaczac od 1. nastepnie get zeby wszystko wyswietlic
            System.out.println((i + 1) + ": " + todoList.get(i));
        }
    }

    public void remove(int number) {
    //Usuń zadanie z podanego numeru
        //numer wiekszy lub =  1 , podana liczba tak samo
        if (number >= 1 && number <= todoList.size()) {
            // tutaj musimy dac -1 bo tak jak up mamy 123, a normalnie 0123
            todoList.remove(number -1);
        } else {
            System.out.println("Please entry correct number.");
        }
    }
}


//TodoList: Stwórz klasę TodoList. Powinna zawierać konstruktor bez parametrów,
// który inicjalizuje wewnętrzną tablicę do przechowywania rzeczy do zrobienia i
// następujące metody:
//
//public void add(String task) - Dodaj zadanie do listy;
//public void print() - Wydrukuj zadania z listy wraz z ich numerem na liście;
//public void remove(int number) - Usuń zadanie z podanego numeru.