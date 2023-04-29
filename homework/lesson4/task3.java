package homework.lesson4;

import java.util.Iterator;
import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(3);

        int sum = 0;
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Сумма всех элементов в LinkedList: " + sum);
    }
}
