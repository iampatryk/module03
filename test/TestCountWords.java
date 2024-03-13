import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestCountWords {

    @Test
    public void checkWordsCount() {
        String text = "Ala ma kota, kota ma Ala";
        Map<String, Integer> myData = new HashMap<>();
        myData.put("Ala",2);
        myData.put("ma",2);
        myData.put("kota",2);

        Map<String, Integer> wordCountMap = CountWords.countWords(text);

        Assertions.assertEquals(myData,wordCountMap);
    }

    // czyli musze zrobic gotowa Mape z tymi danymi ktore mam podane czyli :
    // “Ala, 2”, “ma, 2”, “kota, 2”.
    // a pozniej porownac do siebie dwie mapy


}


//Dla tekstu: “Ala ma kota, kota ma Ala”,
// powinniśmy otrzymać mapę z 3 kluczami i wartościami:
// “Ala, 2”, “ma, 2”, “kota, 2”.