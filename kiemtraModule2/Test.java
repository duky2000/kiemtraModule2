package kiemtraModule2;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("QUẢN LÝ DANH BẠ");
            System.out.println("1.Hiển thị");
            System.out.println("2.Thêm");
            System.out.println("3.Sửa");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm gần đúng");
            System.out.println("6.đọc");
            System.out.println("7.ghi");
            System.out.println("8.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                   QLDanhBa.show();
                    break;
                case 2:
                    QLDanhBa.add();
                    break;
                case 3:
                    QLDanhBa.edit();
                    QLDanhBa.write();
                    break;
                case 4:
                    QLDanhBa.remove();
                    QLDanhBa.write();
                    break;
                case 5:
                    QLDanhBa.searchPhone();
                    break;
                case 6:
                    QLDanhBa.read();
                    break;
                case 7:
                    QLDanhBa.write();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
