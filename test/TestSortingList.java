import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

}


//Używając metody Assertions.assertArrayEquals() i jej przeciwieństwa sprawdź,
//czy tablice obiektów są sobie równe przed i po posortowaniu (nie powinny być)

