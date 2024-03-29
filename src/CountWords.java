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
        String[] words = text.split("[\\s,.;!?\\-:]+");

        //     // Inicjalizacja pustej mapy, gdzie kluczem jest słowo, a wartością ilość jego wystąpień.
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                Integer tmp = wordCountMap.get(word);
                tmp ++;
                wordCountMap.put(word, tmp);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }

    public static HashMap<String, Integer> checkWord(String text, String searchWord) {
//        String[] words = text.split("\\s+");
        String[] words = text.split("[\\s,.;!?\\-:]+");

        HashMap<String, Integer> checkWordMap = new HashMap<>();

        for (String word : words) {
            if(word.equals(searchWord)) {
                Integer count = checkWordMap.get(word);
                // Jeśli słowo już istnieje w mapie, zwiększenie ilości wystąpień o 1
                // Jeśli słowo nie istnieje, dodanie go do mapy z ilością wystąpień równą 1
                if(count != null) {
                    checkWordMap.put(word, count +1);
                } else {
                    checkWordMap.put(word, 1);
                }
            }
        } return checkWordMap;
    }
}


// Zatem wyrażenie text.split("\\s+") dzieli tekst na słowa, traktując dowolny biały znak jako separator
// pomiędzy nimi. Na przykład, jeśli mamy tekst "Ala ma kota", to po użyciu split("\\s+") otrzymamy tablicę
// zawierającą trzy elementy: ["Ala", "ma", "kota"].

// Liczenie słów w tekście: Napisz metodę, która przyjmując String,
// zwróci HashMapę, w której kluczem jest słowo, a wartością ilość
// wystąpień w tekście:


