package CarMyLearning;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Office {

    Map<User, List<Car>> userListMap = new HashMap<>();


    void addUser(User user) {

        userListMap.putIfAbsent(user,new ArrayList<>());
    }

    void addCarToUser(User user, Car car) {
        if(userListMap.containsKey(user)) {
            userListMap.get(user).add(car);
        }
    }

    List<Car> getCarsOfUser(User user) {

        return userListMap.getOrDefault(user, new ArrayList<>());
    }

    List<User> getAllUsers() {

        return new ArrayList<>(userListMap.keySet());
    }

    List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        for (List<Car> cars : userListMap.values()) {
            allCars.addAll(cars);
        }
        return allCars;
    }
}


//constainsKey Ta metoda służy do sprawdzania, czy mapa zawiera określony klucz.

//W języku Java, keySet() jest metodą dostępną dla obiektów implementujących
// interfejs Map. Metoda ta zwraca zbiór (ang. set) zawierający wszystkie klucze
// znajdujące się w danej mapie. Możesz użyć tego zbioru kluczy do iteracji przez
// wszystkie pary klucz-wartość w mapie.

//Metoda putIfAbsent służy do dodawania wartości do
//mapy tylko wtedy, gdy dany klucz jeszcze nie istnieje w mapie.

//Metoda put służy do dodawania lub aktualizowania wartości
// przypisanej do określonego klucza w mapie.

//Metoda getOrDefault służy do pobierania wartości przypisanej do
// określonego klucza w mapie.

// Metoda get służy do pobierania wartości przypisanej do określonego klucza w mapie.