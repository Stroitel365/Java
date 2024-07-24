class Calculator {
    public double calculate(char op, int a, int b) {
      // Введите свое решение ниже
    if(op == '+'){
      return a+b;
    } else if(op=='/') {
        if(b==0){
          System.out.println("Нельзя на ноль делить!");
          return -1;
        } else {
          return a/b;
        }
    } else if(op=='-'){
      return a-b;
    } else if(op=='*'){
      return a*b;
    } else {
      System.out.println("Некорректный оператор: "+"'"+op+"'");
      return -1;
    }
}
}
 

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 7;
            op = '+';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
       // Ниже добавить проверку оператора на корректность


        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
