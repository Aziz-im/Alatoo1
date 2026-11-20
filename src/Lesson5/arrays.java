package Lesson5;

public class arrays {
    static void main(String[] args){
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 2.0d,};
        char[] opCodes = {'d', 'c', 'r', 'l'};
        double[] result = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]){
                case 'd':
                    result[i] = leftVals[i] + rightVals[i];
                    break;
                case 'c':
                    result[i] = leftVals[i] -rightVals[i];
                    break;
                case 'r':
                    result[i] = leftVals[i] * rightVals[i];
                    break;
                case 'l':
                    result[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid option: " + opCodes[i]);
                    result[i] = 0.0d;
                    break;
            }
        }

    }
}
