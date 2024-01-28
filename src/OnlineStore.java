import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}

class Basket {
    private ArrayList<Product> purchasedProducts;

    public Basket() {
        this.purchasedProducts = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        purchasedProducts.add(product);
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
}

class User {
    private String username;
    private String password;
    private Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99, 5);
        Product smartphone = new Product("Smartphone", 499.99, 4);
        Product headphones = new Product("Headphones", 79.99, 3);

        Category electronics = new Category("Electronics");
        electronics.addProduct(laptop);
        electronics.addProduct(smartphone);
        electronics.addProduct(headphones);

        System.out.println("Product Catalog:");
        System.out.println("Electronics: " + electronics.getProducts());

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.getBasket().addToBasket(laptop);
        user2.getBasket().addToBasket(smartphone);
        user2.getBasket().addToBasket(headphones);

        System.out.println("\nUser Purchases:");
        System.out.println("User1: " + user1.getBasket().getPurchasedProducts());
        System.out.println("User2: " + user2.getBasket().getPurchasedProducts());
    }
}
