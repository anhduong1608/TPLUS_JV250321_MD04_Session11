import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Nguyễn Văn A");
        studentList.add("Nguyễn Văn B");
        studentList.add("Nguyễn Văn C");
        studentList.add("Nguyễn Văn D");
        studentList.add("Nguyễn Văn E");

        // vòng lặp for
        System.out.println("Duyệt bằng vòng lặp for:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        // vòng lặp foreach
        System.out.println("\nDuyệt bằng vòng lặp foreach:");
        for (String name : studentList) {
            System.out.println(name);
        }

        // In danh sách iterator
        System.out.println("\nDuyệt bằng Iterator:");
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
