public class Main {
    public static void main(String[] args) {
        greetUser( "Njabulo", "Hlomuka");
        greetUser("Mosh", "TheMan");
    }
    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}