import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    private static LinkedList<Person> userList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("************ MENU QUẢN LÝ NGƯỜI DÙNG ************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    displayUsers();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 4);
    }

    private static void addUser() {
        String name, email, phone;

        do {
            System.out.print("Nhập tên người dùng: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) System.out.println("Vui lòng không để trống!");
        } while (name.isEmpty());

        do {
            System.out.print("Nhập email người dùng: ");
            email = sc.nextLine().trim();
            if (email.isEmpty()) System.out.println("Vui lòng không để trống!");
        } while (email.isEmpty());

        do {
            System.out.print("Nhập số điện thoại người dùng: ");
            phone = sc.nextLine().trim();
            if (phone.isEmpty()) System.out.println("Vui lòng không để trống!");
        } while (phone.isEmpty());

        userList.add(new Person(name, email, phone));
        System.out.println("Người dùng đã được thêm thành công.\n");
    }

    private static void deleteUser() {
        System.out.print("Nhập email người dùng để xóa: ");
        String email = sc.nextLine().trim();
        boolean found = false;

        Iterator<Person> iterator = userList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEmail().equalsIgnoreCase(email)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Người dùng đã được xóa thành công.\n");
        } else {
            System.out.println("Không tìm thấy người dùng với email này.\n");
        }
    }

    private static void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("Danh sách người dùng trống.\n");
            return;
        }

        System.out.println("Danh sách người dùng:");
        for (Person p : userList) {
            p.display();
        }
        System.out.println();
    }
}

