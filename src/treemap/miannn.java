package treemap;

import java.util.Scanner;

public class miannn {
   public miannn(){
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("MENU");
            System.out.println("1, Hien thi");
            System.out.println("2, Them nguoi");
            System.out.println("3, Xoa nguoi");
            System.out.println("4, Sua nguoi");
            System.out.println("5, Tim nguoi");
            System.out.println("6, Sap xep nguoi");
            System.out.println("7, Quit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    productManager.show();
                    System.out.println("Nhap Q de quay lai");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("q")){
                        new miannn();
                    }
                    break;
                case 2:
                    productManager.add();

                    System.out.println("Nhap Q de quay lai");
                    String mane = scanner.nextLine();
                    if (mane.equalsIgnoreCase("q")) {
                        new miannn();
                    }
                        break;
                case 3:
                    productManager.pop();
                    break;
                case 4:
                    productManager.edit();
                    break;
                case 5:
                    productManager.find();
                    break;
                case 6:
                    productManager.sofm();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new miannn();
    }
}
