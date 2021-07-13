package kiemtraModule2;

import Module2CaseStudy.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QLDanhBa {
    static ArrayList<DanhBa> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("contacts.csv");
public QLDanhBa(){

}

    public static void add() throws IOException {

        String sdt = importPhone();
        System.out.println("nhập nhóm danh bạ");
        String nhom = scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String ngaysinh = scanner.nextLine();
        String email = importEmail();
        list.add(new DanhBa(sdt, nhom, name, gender, address, ngaysinh, email));
        write();
    }

    private static String importPhone() {
        while (true) {
            try {
                System.out.println("Nhập số điện thoại");
                String sdt = scanner.nextLine();
                if (Regexphone.check(sdt)) {
                    boolean check = true;
                    for (DanhBa danhBa : list) {
                        if (danhBa.getSđt().equals(sdt)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return sdt;
                    } else {
                        System.err.println("số điện thoại đã tồn tại");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("Số điện thoại phải bắt đầu từ số 0 cho đến 9");
            }

        }
    }

    private static String importEmail() {
        while (true) {
            try {
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                if (RegexEmail.check(email)) {
                    boolean checkMail = true;
                    for (DanhBa db : list) {
                        if (db.getEmail().equals(email)) {
                            checkMail = false;
                            break;
                        }
                    }
                    if (checkMail) {
                        return email;
                    } else {
                        System.err.println("Email đã được sử dụng vui lòng nhập lại ");
                    }
                } else {
                    throw new Exception();

                }

            } catch (Exception e) {
                System.err.println("Email bắt buộc phải viết đúng quy định");
            }
        }

    }

    public static void edit() {
        System.out.println("nhập số điện thoại cần sửa ");
        String sdt = scanner.nextLine();
        String newSdt = importPhone();
        System.out.println("nhập nhóm danh bạ");
        String nhom = scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String ngaysinh = scanner.nextLine();
        String email = importEmail();
        DanhBa danhBa = new DanhBa(newSdt, nhom, name, gender, address, ngaysinh, email);
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSđt().equals(sdt)) {
                index = i;
                list.set(index, danhBa);
            }
        }
        if (index == -1) {
            System.out.println("không có số điện thoại này");
        }
    }

    public static void remove() {
        System.out.println("nhập số điện thoại cần xóa ");
        String sdt = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSđt().equals(sdt)) {
                index = i;
                list.remove(index);
            }
        }
        if (index == -1) {
            System.out.println("không có số điện thoại này");
        }
    }

    public static void searchPhone() {
        System.out.println("nhập số điện thoại cần tìm ");
        String sdt = scanner.nextLine();
        boolean check = false;
        for (DanhBa danhBa : list) {
            if (danhBa.getSđt().contains(sdt)) {
                check = true;
                System.out.println(danhBa.toString());
            }
        }
        if (check) {
            return;
        } else
            System.err.println("Không có số điện thoại bạn muốn tìm");
    }

    public static void write() throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhBa db : list) {
                bufferedWriter.write(db.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    public static void read() throws IOException {
    ArrayList<DanhBa> list1 = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length > 6) {
                    list1.add(new DanhBa(str[0], str[1], str[2], str[3], str[4], str[5], str[6]));
                }
            }
            for (DanhBa db :list1) {
                System.out.println(db.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
    }

    public static void show() throws IOException {
        for (DanhBa db : list) {
            System.out.println(db);
        }
    }
}
