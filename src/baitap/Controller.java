package baitap;

import java.util.ArrayList;
import java.util.Scanner;

 public class Controller extends Book {
    Scanner scanner = new Scanner(System.in);
   static ArrayList <Book> arrayList = new ArrayList <> ();

    static {
        arrayList.add( new Book("Bi rong", 19500, "Kim Dong"));
        arrayList.add( new Book("Tho san x tho san", 19500, "Kim Dong"));
        arrayList.add( new Book("Ninja can thi", 19500, "Kim Dong"));
        arrayList.add( new Book("Tho san do an", 19500, "Kim Dong"));
    }

    public void add(){
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap gia");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap nxb");
        String nxb = scanner.nextLine();
        arrayList.add(new Book(name, price, nxb));
    }
     public void edit(){
         System.out.println("Nhap id");
         int id = Integer.parseInt(scanner.nextLine());
         arrayList.remove(id -1);
         System.out.println("Nhap ten");
         String name = scanner.nextLine();
         System.out.println("Nhap gia");
         int price = Integer.parseInt(scanner.nextLine());
         System.out.println("Nhap nxb");
         String nxb = scanner.nextLine();
         arrayList.add(new Book(name, price, nxb));

     }
     public void delet(){
         System.out.println("Nhap id");
         int id = Integer.parseInt(scanner.nextLine());
         arrayList.remove(id -1);
     }
     public void sow(){
         for (Book duoibau : arrayList ) {
             System.out.println(duoibau.toString());
         }
     }


}
