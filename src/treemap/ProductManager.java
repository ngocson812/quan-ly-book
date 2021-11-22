package treemap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public ProductManager() {
    }

   static Scanner scanner = new Scanner(System.in);
  public static ArrayList<Product> products = new ArrayList<>();
    static {
        products.add(new Product("Khuongchan", 1000.9,"xamxung"));
        products.add(new Product("Khuonglon", 2000.9, "xamxung"));
        products.add(new Product("Khuongbuon", 3000.9, "xamxung"));
        products.add(new Product("Khuongcc", 4000.9, "xamxung"));
    }

    public void show(){
        for (Product vip : products) {
            System.out.println(vip.toString());
        }
    }
    public void add(){
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Gia de");
        int gia =Integer.parseInt( scanner.nextLine());
        System.out.println(" Hang de");
        String hang = scanner.nextLine();
        products.add(new Product(name, gia, hang));

    };
    public void edit(){};
    public void pop(){};
    public void find(){};
    public void sofm(){};

}
