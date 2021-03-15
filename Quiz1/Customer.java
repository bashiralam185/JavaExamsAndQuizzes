import java.security.SecureRandom;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;

    public Customer(String firstName,String lastName,String address, String cardNumber, int pin, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        if (isValidPassword(password)){
            this.password = password;
        }else {
            this.password="DefaultPassword@20";
        }
    }
    public Customer(String firstName,String lastName,String address, String cardNumber, int pin, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)){
            this.password = password;
        }else {
            this.password="DefaultPassword@20";
        }
    }
    @Override
    public String toString() {
        return "Customer [" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin=" + "\'"+pin+"\'" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                "]";
    }
    public boolean isValidPassword(String password){
        if (password.length() < 8){
            return false;
        }
        int upperCount = 0;
        int loweCount = 0;
        int numCount = 0;
        int specialCount = 0;

        for (int j=0; j<password.length(); j++){
            char Char = password.charAt(j);

            if (isDigit(Char)){
                numCount++;
            }
            else if(isUpper(Char)){
                upperCount++;
            }
            else if(Character.isLowerCase(Char)){
                loweCount++;
            }
            else if (specialCharacter(Char)){
                specialCount++;
            }

        }
        return !(upperCount == 0 || loweCount==0 || numCount == 0 || specialCount == 0);
    }

    public boolean specialCharacter(char A){
        String specialChar = "@#$%";
        for (int i=0; i < specialChar.length(); i++){
            char B = specialChar.charAt(i);
            if (A == B){
                return true;
            }
        }

        return false;
    }

    public static boolean isUpper(char a) {
        return a >= 'A' && a <= 'Z';
    }


    public static boolean isDigit(char a) {

        return a >= '0' && a <= '9';
    }
}