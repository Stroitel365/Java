import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
            Scanner scanner = new Scanner(System.in);
            System.out.println("set the top number: ");
            int top = scanner.nextInt();
            for (int i=2;i<top;i++){
                if(checkSimple(i))
                    System.out.println(i);
            scanner.close();
            }
        }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}
