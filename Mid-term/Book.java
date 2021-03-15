import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;
//constructor
    public Book(String name, Author[] author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public Book(String name, Author[] author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
//getter and settor
    public String getName() {

        return name;
    }

    public Author[] getAuthors() {

        return this.author;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getQty() {

        return qty;
    }

    public void setQty(int qty) {

        this.qty = qty;
    }
// to string method
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", authors=" + Arrays.toString(author) + ", price=" + price + ", qty=" + qty + '}';
    }

    public String getAuthorsName(){
        String result = "";
        for (int k = 0; k < author.length; k++){
            result += author[k].getName();
            result += ", ";
        }
        return result;
    }
}