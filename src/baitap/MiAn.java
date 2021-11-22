package baitap;

import treemap.ProductManager;
import treemap.miannn;

import java.util.Scanner;

public class MiAn {
    public MiAn(){
        Controller controllers = new Controller();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("MENU");
            System.out.println("1, Them sach");
            System.out.println("2, Sua sach");
            System.out.println("3, Xoa sach");
            System.out.println("4, Hien thi sach");
            System.out.println("5,  Quit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                   controllers.add();
                    System.out.println("Nhap S de quay lai");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("s")){
                        new MiAn();
                    }
                   break;

                case 2:
                    controllers.edit();
                    System.out.println("Nhap S de quay lai");
                    String name2 = scanner.nextLine();
                    if (name2.equalsIgnoreCase("s")){
                        new MiAn();
                    }
                    break;
                case 3:
                    controllers.delet();
                    System.out.println("Nhap S de quay lai");
                    String name3 = scanner.nextLine();
                    if (name3.equalsIgnoreCase("s")){
                        new MiAn();
                    }
                    break;
                case 4:
                    controllers.sow();
                    System.out.println("Nhap S de quay lai");
                    String name1 = scanner.nextLine();
                    if (name1.equalsIgnoreCase("s")){
                        new MiAn();
                    }
                    break;
                case 5:
                    System.exit(5);
            }
        }
    }
    public static void main(String[] args) {
        new MiAn();
    }
}
