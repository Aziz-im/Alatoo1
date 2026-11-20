package intro;

import java.util.Arrays;

public class intro {

    public static void main(String[] args) {
        int[] c = new int[]{42, 11, 25, 7, 88, 19};

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int t = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t;
                }
            }
            System.out.println("After  " + i + ": " + Arrays.toString(c));
        }
    }

}
