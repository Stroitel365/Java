
import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        if (a.length < 2) {
            return a;
        } else {
            int[] left = new int[a.length / 2];
            int[] right = new int[a.length - a.length / 2];
            System.arraycopy(a, 0, left, 0, a.length / 2);
            System.arraycopy(a, a.length / 2, right, 0, a.length - a.length / 2);
            //System.err.println(Arrays.toString(left));
            //System.err.println(Arrays.toString(right));
            mergeSort(left);
            mergeSort(right);
            a = mergeHalfs(a, left, right);
            return a;
            // int temp = Math.min(left[0], right[0]);

        }

    }

    public static int[] mergeHalfs(int[] a, int[] left, int[] right) {
        //int[] mergeA = new int[left.length + right.length];
        int leftIdx = 0;
        int rightIdx = 0;
        int aIdx = 0;
        while (leftIdx < left.length && rightIdx < right.length) {
            if (left[leftIdx] < right[rightIdx]) {
                a[aIdx] = left[leftIdx];
                aIdx++;
                leftIdx++;
            } else {
                a[aIdx] = right[rightIdx];
                aIdx++;
                rightIdx++;
            }
        }
        for (int i = leftIdx; i < left.length; i++) {
            a[aIdx++] = left[i];
        }
        for (int j = rightIdx; j < right.length; j++) {
            a[aIdx] = right[j];
            aIdx++;
        }
        return a;

    }
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{-5, 1, 6, 2, 3, 4, -7, -10, 20}; // 0 1 2 3 4 5 // 6
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
