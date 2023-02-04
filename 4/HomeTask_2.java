/*
 Задание 2:

Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.
 */
import java.util.*;
import java.util.LinkedList;
public class HomeTask_2 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        Queue<Integer> st1 = new LinkedList<>();
        int n = InputNamber.InputN();
        for (int i = 0; i<n; i++){
            st1.add((int)(Math.random()*(100)));
        }
        System.out.println(st1);

        n = InputNamber.InputNam();
        st1 = enqueue(st1, n);
        System.out.println(st1);
        System.out.println(dequeue(st1));
        System.out.println(st1);
        System.out.println(first(st1));
        System.out.println(st1);

    }
public static Queue<Integer> enqueue(Queue<Integer> ll,int item){
    System.out.println("Помещаем элемент в конец очереди");
    ll.add(item);
    return ll;
}
public static int dequeue(Queue<Integer> ll){
    System.out.println("Возвращаем первый элемент из очереди и удаляем его");
    return ll.poll();
}
public static int first(Queue<Integer> ll){
    System.out.println("Возвращаем первый элемент из очереди и не удаляем его");
    
    return ll.peek();
}
}
