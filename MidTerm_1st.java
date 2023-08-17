public class MidTerm_1st {
    public static void main(String[] args) {

        //Create Objects
        Product p1 = new Product("chair", 500.0);
        Electronics e1 = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        Smartphone s1 = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book b1 = new Book("OOP Programming", 250.0, "John Doe", 300);
        

        //Show Details
        p1.showDetails();
        e1.showDetails();
        s1.showDetails();
        b1.showDetails();
    }
}



class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("******************************");
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}



// Electronics --> Product ***START***
class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, String brand, String model){
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
// Electronics --> Product ***END***



// Book --> Product ***START***
class Book extends Product {
    private String author;
    private int pages;

    public Book(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }
    
    public void showDetails() {
        super.showDetails();
        System.out.println("Author : " + this.author);
        System.out.println("Number of Pages : " + this.pages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
// Book --> Product ***END***



// Smartphone --> Electronics --> Product ***START***
class Smartphone extends Electronics {
    private String OperatingSystem;

    public Smartphone(String name, double price, String brand, String model, String OperatingSystem) {
        super(name, price, brand, model);
        this.OperatingSystem = OperatingSystem;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Operating System : " + this.OperatingSystem);
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

}
// Smartphone --> Electronics --> Product ***END***
