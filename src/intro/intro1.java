package intro;

import java.util.Arrays;

public class intro1 {

    public static void main(String[] args) {
        int[] arr = {3, 8, 14, 19, 27, 33, 45, 52, 61, 78, 89, 95};
        int target = 61;

        int low = 0;
        int high = arr.length - 1;
        int steps = 0;
        int index = -1;

        System.out.println("Target = " + target);
        System.out.println("Step | Low | High | Mid | arr[Mid] | Action");

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;


            System.out.printf("%-4d | %-3d | %-4d | %-3d | %-8d | ",
                    steps, low, high, mid, arr[mid]);

            if (arr[mid] == target) {
                System.out.println(arr[mid] + " == " + target + ", found!");
                index = mid;
                break;
            } else if (arr[mid] < target) {
                // искомое справа, отбрасываем левую половину
                System.out.println(arr[mid] + " < " + target + ", Low = " + (mid + 1));
                low = mid + 1;
            } else {
                // искомое слева, отбрасываем правую половину
                System.out.println(arr[mid] + " > " + target + ", High = " + (mid - 1));
                high = mid - 1;
            }
        }

        System.out.println();
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element not found");
        }
        System.out.println("Total comparisons: " + steps);
    }
}
