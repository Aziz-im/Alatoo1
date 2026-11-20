package intro;

import java.util.Arrays;

public class intro2 {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        System.out.println("Initial: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // ищем минимум в неотсортированной части
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            System.out.print("Pass " + (i + 1) + ": min = " + arr[minIndex]
                    + " at index " + minIndex);

            // меняем местами, если нужно
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                System.out.println(", swap with index " + i);
            } else {
                System.out.println(", no swap");
            }

            System.out.println("Result:  " + Arrays.toString(arr));
        }
    }

}
