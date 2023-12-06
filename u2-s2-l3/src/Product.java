import java.awt.print.Book;
import java.util.*;

public class Product {
    private String name;
   private  Category category= Category.Books;
    private Double price;
private int id;

    public Product(String name, Category category, Double price) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.name = name;
        this.category= Category.Books;
        this.price= price;

                }

    public Product() {
    }




}




