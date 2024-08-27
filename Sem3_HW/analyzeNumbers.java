
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class analyzeNumbers {

    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        List<Integer> ints = Arrays.asList(arr);
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + Collections.min(ints));
        System.out.println("Maximum is " + Collections.max(ints));
        double average = (double) sum / arr.length;
        System.out.println("Average is " + average);
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNumbers ans = new analyzeNumbers();
        ans.analyzeNumbers(arr);
    }
}
