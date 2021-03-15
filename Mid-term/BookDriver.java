import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Author[] authors = {
                new Author("Chyngyz", "aitmatov@gmail.kg", 'M'),
                new Author("Aleksei", "pushkin@yandex.ru", 'M')
        };


        Book dummyBook = new Book("Java", authors, 9.93, 98);
        System.out.println(dummyBook);
        System.out.println(dummyBook.getAuthorsName());
        System.out.println(Arrays.toString(dummyBook.getAuthors()));


    }
}