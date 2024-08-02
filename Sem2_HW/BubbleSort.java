import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/* 
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' 
в формате год-месяц-день час:минуты {массив на данной итерации}. 
Для логирования использовать логгер logger класса BubbleSort.
*/

public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public void sort(int[] mas) {
        int a = mas.length;
        DateTimeFormatter dtform = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt"))) {
            boolean flag = false;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - i - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        flag = true;
                    }

                }
                if (flag) {
                    writer.println(dtform.format(LocalDateTime.now()) + " " + Arrays.toString(mas));
                    flag = false;
                }
            }
            writer.println(dtform.format(LocalDateTime.now()) + " " + Arrays.toString(mas));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

////////
/*
 * public static void logger (String[] args) throws IOException {
 * Logger logger = Logger.getLogger(Z2.class.getName());
 * FileHandler fh = new FileHandler(«logZ2.xml»);
 * logger.addHandler(fh);
 * XMLFormatter xml = new XMLFormatter();
 * fh.setFormatter(xml);
 * logger.info(«Massiv:»);
 * int [] array = {1, 5, 3, -9, 3, 64, 0};
 * printArrayInt(array);
 * int[] newArr = listSort(array);
 * System.out.printf(«\n Отсортированный массив: \n»);
 * printArrayInt(newArr);
 * }
 * 
 * public static int[] listSort(int [] arr){
 * for(int k = 0; k < arr.length-1; k++) {
 * 
 * for (int i = 0; i < arr.length — k-1; i++){
 * if (arr[i] > arr[i+1]) {
 * int temp = arr[i];
 * arr[i] = arr[i+1];
 * arr[i+1] = temp;
 * }
 * }
 * }
 * return arr;
 * }
 * 
 * }
 */