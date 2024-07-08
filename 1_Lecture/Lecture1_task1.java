/* 
Задана натуральная степень k. Сформировать случайным
образом список коэффициентов (значения от 0 до 100)
многочлена многочлен степени k.
*Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
 */

import java.util.Scanner;

import java.util.Arrays;

public class Lecture1_task1 {
    public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.println("Input max degree of polynominal");
       int k = iScanner.nextInt();
       int arr[] = new int[k+1];
       System.out.println(k);
        for ( int i = 0; i <= k; i++) {
            arr[i] = (int) ( Math.random() * 101 );
        }
       // if (arr[k] == 0) arr[k]=1;
        System.out.println(Arrays.toString(arr));
        String equation = "";
        for (int j = k; j>-1; j--) {
            if (arr[j]!=0) {
                if (arr[j]==1){
                    if (j==0) {equation=equation+" 1 ";}
                    else if (j==1) {equation=equation+" x ";}
                    else equation=equation+String.valueOf(arr[j])+" * x^ "+String.valueOf(j)+" + ";
                } else{
                    if (j==0) equation=equation+String.valueOf(arr[j])+" + ";
                    else if (j==1) equation=equation+String.valueOf(arr[j])+" * x"+" + ";
                    else equation=equation+String.valueOf(arr[j])+" * x^ "+String.valueOf(j)+" + ";
                }
            }
        }
        equation = equation.substring(0, equation.length()-2)+" = 0";
        System.out.println(equation);
        iScanner.close();
    }
}
