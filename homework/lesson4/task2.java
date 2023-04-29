// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
package homework.lesson4;

import java.util.LinkedList;

public class task2 {
    public static class Queue<T> {
        private LinkedList<T> list = new LinkedList<>();

        public void enqueue(T item) {
            list.addLast(item);
        }

        public T dequeue() {
            return list.pollFirst();
        }

        public T first() {
            return list.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        System.out.println(queue.list);
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.list);
        System.out.println(queue.first());
        System.out.println(queue.dequeue());

    }

}
