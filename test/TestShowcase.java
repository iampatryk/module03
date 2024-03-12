import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestShowcase {
    @Test
    public void testEqualsAssertions() {
        String Ala = "Ala";
        Assertions.assertEquals("Ala",Ala);
    }
    @Test
    public void testTrueAssertions() {
        String Ala = "Ala";
        Assertions.assertTrue(6 > 5);
    }
    @Test
    public void testArrayEqualsAssertions() {
        int[] firstArray = {1,2,3};
        int[] secondArray = {1,1,3};
        Assertions.assertArrayEquals(firstArray,secondArray);
    }

}
