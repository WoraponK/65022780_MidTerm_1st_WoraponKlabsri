public class MidTerm_1st {
    public static void main(String[] args) {
        Product p1 = new Product("chair", 500.0);
        p1.showDetails();

        Electronics e1 = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        e1.showDetails();

        Smartphone s1 = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        s1.showDetails();

        Book b1 = new Book("OOP Programming", 250.0, "John Doe", 300);
        b1.showDetails();
    }
}

class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void showDetails() {
        System.out.println("******************************");
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, Double price, String brand, String model){
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
    }
}

class Book extends Product {
    private String author;
    private Integer pages;

    public Book(String name, Double price, String author, Integer pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPages() {
        return pages;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Author : " + this.author);
        System.out.println("Number of Pages : " + this.pages);
    }
}

class Smartphone extends Electronics {
    private String OperatingSystem;

    public Smartphone(String name, Double price, String brand, String model, String OperatingSystem) {
        super(name, price, brand, model);
        this.OperatingSystem = OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Operating System : " + this.OperatingSystem);
    }
}
