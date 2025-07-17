import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(5);
        numberList.add(9);
        numberList.add(12);
        numberList.add(7);
        numberList.add(18);
        numberList.add(21);
        numberList.add(4);

        // danh sách
        System.out.println("Danh sách trước khi xóa:");
        System.out.println(numberList);

        Iterator<Integer> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 3 == 0) {
                iterator.remove();
            }
        }
        // in danh sách
        System.out.println("Danh sách sau khi xóa các số chia hết cho 3:");
        System.out.println(numberList);
    }
}
