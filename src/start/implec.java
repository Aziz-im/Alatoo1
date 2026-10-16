package start;

public class implec {

    public static void main(String[] args) {
        int a = 20;
        long b = a;

        // 2. int to float
        int c = 30;
        float d = c;

        // 3. long to float
        long e = 40L;
        float f = e;

        // 4. float to double
        float g = 40.8f;
        double h = g;

        // 5. char to int
        char i = 'C';
        int j = i;

        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        System.out.println(h);
        System.out.println(j);
    }
}
