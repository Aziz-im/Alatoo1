package start;

public class expicit {

    public static void main(String[] args) {

        // 1. double to int
        double a = 10.6;
        int b = (int) a;

        // 2. float to int
        float c = 20.7f;
        int d = (int) c;

        // 3. long to int
        long e = 1009L;
        int f = (int) e;

        // 4. int to byte
        int g = 120;
        byte h = (byte) g;

        // 5. int to char
        int i = 75;
        char j = (char) i;

        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        System.out.println(h);
        System.out.println(j);

    }

}
