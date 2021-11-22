package treemap;

public class Product {
    private  int id;
    private String name;
    private double price;
    private String brand;

    public static int letgo = 1;

    public Product() {
    }

    public Product(String name, double price, String brand) {
        this.id = letgo++;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getLetgo() {
        return letgo;
    }

    public static void setLetgo(int letgo) {
        Product.letgo = letgo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}

