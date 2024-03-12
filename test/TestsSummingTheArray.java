import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsSummingTheArray {
    @Test
    public void checkIfTableReturnTrue() {

        int[] tablica = {1,3,5};
        int sum = SummingTheArray.sumaTablicyLiczb(tablica);
        Assertions.assertEquals(9,sum);

    }
}


//Sprawdzenie czy tablica 1, 3, 5 zwróci 9;
//Sprawdzenie zachowania dla liczb ujemnych