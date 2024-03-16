import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPassword {

    PasswordChecker passwordChecker = new PasswordChecker();

    @Test
    public void testHasGoodLength() {
        Assertions.assertTrue(passwordChecker.hasGoodLength("1234567890qw"));
        Assertions.assertFalse(passwordChecker.hasGoodLength("12345"));
    }
    @Test
    public void testHasNoWithSpaces() {
        Assertions.assertTrue(passwordChecker.hasNoWhiteSpaces("1234567890qw"));
        Assertions.assertFalse(passwordChecker.hasNoWhiteSpaces("123 456 78 90qw"));
    }

    @Test
    public void hasNoRepetitions() {
        Assertions.assertTrue(passwordChecker.hasNoRepetitions("1234567890qw"));
        Assertions.assertTrue(passwordChecker.hasNoRepetitions("11aadsdsffds"));
    }

    @Test
    public void hasNumbers() {
        Assertions.assertTrue(passwordChecker.hasNumbers("abcdweds2345"));
        Assertions.assertFalse(passwordChecker.hasNumbers("asdefrdesdfs"));
    }

    @Test
    public void hasSpecialCharacter() {
        Assertions.assertTrue(passwordChecker.hasSpecialCharacter("asdw!?asd321"));
        Assertions.assertFalse(passwordChecker.hasSpecialCharacter("asdwsdasd321"));
    }

}


//Używając metodologii TDD napisz testy oraz klasę weryfikującą hasła,
// która sprawdza, czy hasło ma długość co najmniej 12 znaków,
// nie ma białych znaków, żadne znaki koło siebie się nie powtarzają,
// zawiera co najmniej jeden numer oraz znak specjalny(!.@-;”(){}[]?):
//public boolean hasGoodLength(String password);
//public boolean hasNoWhiteSpaces(String password);
//public boolean hasNoRepetitions(String password);
//public boolean hasNumbers(String password);
//public boolean hasSpecialCharacter(String password).