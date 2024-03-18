import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsSummingTheArray {
    @Test
    public void checkIfTableReturnTrue() {
        int[] tablica = {1,3,5};
        int sum = SummingTheArray.sumaTablicyLiczb(tablica);
        Assertions.assertEquals(9,sum);
        Assertions.assertNotEquals(0,sum);
//        Assertions.assertTrue();
    }

    @Test
    public void checkReactionForNegativeNumbers() {
        int[] arrayWithNegativeNumber = {1,2,1,-4};
        int sum = SummingTheArray.sumaTablicyLiczb(arrayWithNegativeNumber);
        Assertions.assertEquals(0,sum);
        Assertions.assertNotEquals(4,0);
    }
}


//Sprawdzenie czy tablica 1, 3, 5 zwróci 9;
//Sprawdzenie zachowania dla liczb ujemnych