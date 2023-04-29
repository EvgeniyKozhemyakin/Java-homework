// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
package homework.lesson4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        LinkedList<Integer> reversedList = reverseList(list);
        System.out.println(reversedList);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }
}
