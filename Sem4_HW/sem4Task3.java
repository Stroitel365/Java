
import java.util.ArrayDeque;
import java.util.Deque;

class sem4Task3 {

    public static class Calculator1 {

        public Deque<Double> resultsStack = new ArrayDeque<>();
        public double prevResult;

        public double calculate(char op, int a, int b) {
            // Введите свое решение ниже
            switch (op) {
                case '+':
                    resultsStack.add((double) a + b);
                    return a + b;
                case '/':
                    if (b == 0) {
                        System.out.println("Нельзя на ноль делить!");
                        return -1;
                    } else {
                        resultsStack.add((double) a / b);
                        return a / b;
                    }
                case '-':
                    resultsStack.add((double) a - b);
                    return a - b;
                case '*':
                    resultsStack.add((double) a * b);
                    return a * b;
                case '<':
                    prevResult = resultsStack.pop();
                    return prevResult;
                default:
                    System.out.println("Некорректный оператор: " + "'" + op + "'");
                    return -1;
            }
        }
    }

    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator1 calculator = new Calculator1();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
