public class AuthorDriver {
    public static void main(String[] args) {
        Author Bashir = new Author("bashiralam", "bashiralam_2023.com", 'm');
        System.out.println(Bashir);
        Bashir.setEmail("bashiralam.com");
        System.out.println("name is: " + Bashir.getName());
        System.out.println("email is: " + Bashir.getEmail());
        System.out.println("gender is: " + Bashir.getGender());
    }
}
