
import java.util.LinkedList;
import java.util.Stack;

/*
Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks реализуйте 
разворот этого списка без использования встроенного функционала.
 */
public class sem4Task1 {

    static class LLTasks {

        public void revertLL(LinkedList<Object> ll) {
            // Напишите свое решение ниже
            Stack<Object> st = new Stack<Object>();
            try {
                for (Object i : ll) {
                    st.push(i);
                }
                ll.clear();
                while (!st.isEmpty()) {
                    ll.add(st.pop());
                }
            } catch (Exception e) {

            }

        }
    }

    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.revertLL(ll);
        System.out.println(ll);
    }
}
