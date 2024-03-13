public class SummingTheArray {
    public void sumArray() {
        int[] numbers = {2,3222,6,19,234,4,234,99,43};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
            System.out.println("Summing array numbers: " + sum);
    }
    // dodac argument sumArray(tutaj)
    public void sumaTablicy() {
        int[] liczby = {2333,3233,3233,333};
        int suma = 0;
        for ( int lic : liczby) {
            suma += lic;
        }
        System.out.println("Suma = " + suma);
    }

    public static int sumaTablicyLiczb(int[] tablicaLiczb) {
        int suma = 0;
        for ( int liczba : tablicaLiczb) {
                suma += liczba;
        }
        System.out.println("Suma = " + suma);
        return suma;
    }

//    public static int sumaTablicyLiczb(int[] tablicaLiczb) {
//        int suma = 0;
//        for ( int liczba : tablicaLiczb) {
//            if(liczba >= 0) {
//                suma += liczba;
//            }
//        }
//        System.out.println("Suma = " + suma);
//        return suma;
//    }
//    metoda ktora nie pozwala uzywa liczb ujemnych w tablicy
}



// Sumowanie tablicy: Stwórz metodę, która przyjmuje jako argument
// tablicę liczb naturalnych i zsumuje jej wartości:
// public int sumArray(int[] numbers)