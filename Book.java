
import java.util.Arrays;

public class Book{

    String title;
    String[] authors;
    String publisher;
    String price;
    int stock;

    public Book(String title) {
        this.title = title;
    }
    String getTitle() {
        return this.title;
    }
    void setTitle(String title) {
        this.title=title;
    }
    void setStock(int stock) {
        this.stock=stock;
    }
    int getStock() {
        return this.stock;
    }

    String getPrice() {
        return price;
    }

    void setPrice(String price) {
        this.price = price;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    String[] getAuthors() {
        return authors;
    }

    void setAuthors(String[] authors) {
        if(authors.length>4){
            System.out.println("Max four Authors allowed");
        } else {
            this.authors = authors;
        }
    }
    void printDetails() {
        System.out.printf("Title:\t\t%s\n",getTitle());
        System.out.printf("Publisher:\t%s\n",getPublisher());
        System.out.printf("Authors:\t%s\n",Arrays.toString(getAuthors()));
        System.out.printf("Stock:\t\t%s\n",getStock());
        System.out.printf("Price:\t\t%s\n",getPrice());


    }
    







}