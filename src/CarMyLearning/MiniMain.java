package CarMyLearning;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MiniMain {

    public static void main(String[] args) {
        System.out.println(" ----- RENTAL CARS -----" + "\n");

        Office office = new Office();
        //Urzytkownik user:
        User uers1 = new User("Adam",33,"Audi");
        User uers2 = new User("Karolina",37,"BMW");
        office.addUser(uers1);
        office.addUser(uers2);
        //Auta :
        Car auto1 = new Car("Audi","A8",209000);
        Car auto2 = new Car("BMW","X7",199000);
        Car auto3 = new Car("Audi","A6",6000);
        Car auto4 = new Car("PEUGEOT","4007",680);
        Car auto5 = new Car("DS","5",6380);
        Car auto6 = new Car("Dacia","Logan",380);
        Car auto7 = new Car("Audi","A4",334480);
        office.addCarToUser(uers1,auto1);
        office.addCarToUser(uers2,auto2);
        office.addCarToUser(uers2,auto3);
        office.addCarToUser(uers1,auto4);
        office.addCarToUser(uers2,auto5);
        office.addCarToUser(uers2,auto7);
        office.addCarToUser(uers2,auto6);

        System.out.println("----- Cars Of Users 1 -----");
        List<Car> userCars = office.getCarsOfUser(uers1);
        for(Car car : userCars) {
            System.out.println(car.mark + " " + car.model + " " + car.engine);
        }

        System.out.println("----- Cars Of Users 2 -----");
        List<Car> userCars2 = office.getCarsOfUser(uers2);
        for(Car car : userCars2) {
            System.out.println(car.mark + " " + car.model + " " + car.engine);
        }

        System.out.println("----- All users -----");
        List<User> userList = office.getAllUsers();
        for(User user : userList) {
            System.out.println(user.name + " " + user.age + " " + user.favouriteModel);
        }

        System.out.println("----- All cars -----");
        List<Car> allCarList = office.getAllCars();
        for (Car car : allCarList) {
            System.out.println(car.mark + " " + car.model + " " + car.engine);
        }

        System.out.println("----- Sorting cars by engine -----");
        List<Car> allCarsList = office.getAllCars();
        Collections.sort(allCarsList);
        for(Car car : allCarsList) {
            System.out.println(car.mark + " " + car.model + " " + car.engine);
        }


    }

}
