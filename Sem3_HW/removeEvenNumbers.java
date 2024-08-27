
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeEvenNumbers {

    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res.add(arr[i]);
            }
        }
        System.out.println(res);

    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        removeEvenNumbers ans = new removeEvenNumbers();
        ans.removeEvenNumbers(arr);
    }
}
