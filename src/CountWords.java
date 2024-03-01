import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public void wordCounter() {

        String text = "Ogólnie tekst znana teza głosi, iż tekst użytkownika może rozpraszać zrozumiała zawartość strony, kiedy ten chce zobaczyć sam jej wygląd. Jedną z mocnych stron używania Lorem Ipsum jest to, że ma wiele różnych „kombinacji” zdań, słów i akapitów, w przeciwieństwie do zwykłego: „tekst, tekst, tekst”, sprawiającego, że wygląda to „zbyt czytelnie” po polsku. Wielu webmasterów i designerów używa Lorem Ipsum jako domyślnego modelu tekstu i wpisanie w internetowej wyszukiwarce ‘lorem ipsum’ spowoduje znalezienie bardzo wielu stron, które wciąż są w budowie. Wiele wersji tekstu ewoluowało i zmieniało się przez lata, czasem przez przypadek, czasem specjalnie (humorystyczne wstawki itd).";
        String word = "tekst";
        String[] separateText = text.split(word);
        int numberWord = separateText.length - 1;
        System.out.println("Word: " + word + " it's use " + numberWord + " times.");

    }

    public static HashMap<String, Integer> countWords(String text) {
        // podzielenie tekstu
        String[] words = text.split("\\s+");
        //     // Inicjalizacja pustej mapy, gdzie kluczem jest słowo, a wartością ilość jego wystąpień.
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Metoda merge z HashMap pozwala na łączenie wartości dla danego klucza.
            // Jeśli klucz (słowo) już istnieje w mapie, użyj funkcji Integer::sum, aby zwiększyć liczbę wystąpień o 1.
            // Jeśli klucz nie istnieje, dodaj nowy klucz z wartością 1.
            wordCountMap.merge(word, 1, Integer::sum);
        }
//        return wordCountMap;
        return wordCountMap;
    }
}


//Zatem wyrażenie text.split("\\s+") dzieli tekst na słowa, traktując dowolny biały znak jako separator
// pomiędzy nimi. Na przykład, jeśli mamy tekst "Ala ma kota", to po użyciu split("\\s+") otrzymamy tablicę
// zawierającą trzy elementy: ["Ala", "ma", "kota"].

// Liczenie słów w tekście: Napisz metodę, która przyjmując String,
// zwróci HashMapę, w której kluczem jest słowo, a wartością ilość
// wystąpień w tekście:

//public HashMap<String, Integer> countWords(String text)

