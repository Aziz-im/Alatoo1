import java.util.Arrays;

public class intro {

    public static void main(String[] args){
        int[] i = new int[]{42, 11, 25, 7, 88, 19};

        for (int pass = 1; pass <= 3; pass++) {
            for (int j = 0; j < i.length - 1; j++) {
                if (i[j] > i[j + 1]) {
                    int t = i[j];
                    i[j] = i[j + 1];
                    i[j + 1] = t;
                }
            }
            System.out.println("After  " + pass + ": " + Arrays.toString(i));
        }
    }

}
