
import java.util.Arrays;

public class sem5task3 {

    static class HeapSort {

        public static void buildTree(int[] tree, int sortLength, int i) {
            // Введите свое решение ниже
            // Find largest among root, left child and right child
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;

            if (l < sortLength && tree[l] > tree[largest]) {
                largest = l;
            }

            if (r < sortLength && tree[r] > tree[largest]) {
                largest = r;
            }

            // Swap and continue heapifying if root is not largest
            if (largest != i) {
                int swap = tree[i];
                tree[i] = tree[largest];
                tree[largest] = swap;

                buildTree(tree, sortLength, largest);
            }
        }

        public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
// Build max heap
            for (int i = sortLength / 2 - 1; i >= 0; i--) {
                buildTree(sortArray, sortLength, i);
            }

// Heap sort
            for (int i = sortLength - 1; i >= 0; i--) {
                int temp = sortArray[0];
                sortArray[0] = sortArray[i];
                sortArray[i] = temp;

// Heapify root element
                buildTree(sortArray, i, 0);
            }
        }
    }
// Не удаляйте и не меняйте метод Main! 

    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
