package start;

class impicit {
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

class explicit {
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