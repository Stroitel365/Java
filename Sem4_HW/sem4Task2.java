
/*
В классе MyQueueInt реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди
    dequeue() - возвращает первый элемент из очереди и удаляет его
    first() - возвращает первый элемент из очереди, не удаляя
    getElements() - возвращает все элементы в очереди

Пример: 
queue.enqueue(1); queue.enqueue(10); queue.enqueue(15); queue.enqueue(5); System.out.println(queue.getElements()); 
Результат: [1, 10, 15, 5]

queue.dequeue(); queue.dequeue(); System.out.println(queue.getElements());
Результат:  [15, 5]

System.out.println(queue.first());
Результат: 15
 */
import java.util.LinkedList;

public class sem4Task2 {

    static class MyQueueInt {

        private final LinkedList<Integer> q;

        public MyQueueInt() {
            q = new LinkedList<>();
        }

        public void enqueue(int element) {
            q.add(element);
        }

        public int dequeue() {
            return (int) q.poll();
        }

        public int first() {
            return (int) q.peek();
        }

        public String getElements() {
            return q.toString();
        }
    }

    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());
        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }

    private static class q {

        public q() {
        }
    }
}
