/**
Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список.
 */
import java.util.*;
import java.util.LinkedList;
public class HomeTask_1 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        LinkedList<Integer> st1 = new LinkedList<>();
        int n = InputNamber.InputN();
        for (int i = 0; i<n; i++){
            st1.add((int)(Math.random()*(100)));
        }
        System.out.println(st1);
        st1 = myMethod(st1);
        System.out.println(st1);
    }
    static LinkedList <Integer> myMethod(LinkedList <Integer>ll){
        LinkedList<Integer> newLl = new LinkedList<>();
        System.out.println("Возвращаем  <перевернутый> список");
        Stack<Integer> st = new Stack <Integer>();
        int m = ll.size();
        for(int i = 0; i<m; i++){
            newLl.addFirst(ll.poll());
        }
            return newLl;
    }
}
