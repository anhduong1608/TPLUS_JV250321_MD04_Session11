import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // nhập chuỗi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên ngôn ngữ cần kiểm tra: ");
        String input = scanner.nextLine();

        // kiểm tra in kết quả
        boolean exists = languages.contains(input);
        if (exists) {
            System.out.println("Chuỗi \"" + input + "\" có tồn tại trong HashSet.");
        } else {
            System.out.println("Chuỗi \"" + input + "\" KHÔNG tồn tại trong HashSet.");
        }

        scanner.close();
    }
}
