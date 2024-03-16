public class PasswordChecker {


    public boolean hasGoodLength(String password) {
//        return password.length() >= 12;

        if (password.length() >= 12) {
            return true;
        } else {
            System.out.println("Password must contain more than 12 characters");
            return false;
        }

    }
    public boolean hasNoWhiteSpaces(String password) {
//        return !password.contains(" ");

        if (password.contains(" ")) {
            System.out.println("The password cannot contain spaces");
            return false;
        } else {
            return true;
        }

    }
    public boolean hasNoRepetitions(String password) {
        //Sprawdzamy/przechodzimy przez kazdy znak
        for(int i = 0; i < password.length() - 1; i++) {
            //jak i jest takie samo jak i + 1 czyli kolejny znak to false
            if(password.charAt(i) == password.charAt(i + 1)) {
                System.out.println("Characters next to each other cannot be repeated");
                return false;
            }
        }
        return true;
    }

    public boolean hasNumbers(String password) {
        if(password.matches(".*\\d.*")) {
            return true;
        } else {
            System.out.println("The password must contain numbers");
            return false;
        }
    }

    public boolean hasSpecialCharacter(String password) {
        if(password.matches(".*[@#$%].*")) {
            return true;
        } else {
            System.out.println("The password must contain special characters");
            return false;
        }
    }

    public boolean hasUpperCase(String password) {
        if(password.matches(".*[A-Z].*")) {
            return true;
        } else {
            System.out.println("The password must contain uppercase letters");
            return false;
        }
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