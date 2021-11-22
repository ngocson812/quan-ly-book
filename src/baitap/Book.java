package baitap;

public class Book {
    private String name;
    private double price;
    private String nxb;
    private int id;

    public static int letgo = 1;
    public Book() {
    }

    public Book(String name, double price, String nxb) {
        this.name = name;
        this.price = price;
        this.nxb = nxb;
        this.id = letgo++;
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

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nxb='" + nxb + '\'' +
                ", id=" + id +
                '}';
    }
}
