import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
         * (произведение чисел от 1 до n)
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input number n to calculate triangle number:  ");
        int n = iScanner.nextInt();
        System.out.println("Input number m to calculate m! : ");
        int m = iScanner.nextInt();
        // System.out.println(n);
        // System.out.println(m);
        int sumN=0, sumM=1;
        for (int i = 0; i <= n; i++) {
            sumN=sumN+i;
        }
        for (int i = 1; i <= m; i++) {
            sumM=sumM*i;
        }
        System.out.println(sumN);
        System.out.println(sumM);
        iScanner.close();

    }
}