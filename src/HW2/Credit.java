package HW2;
import java.util.Scanner;
public class Credit {

    static final int MIN_AGE = 21;
    static final int MAX_AGE = 65;
    static final double MIN_INCOME = 30000;
    static final int MIN_CREDIT_SCORE = 70;
    static final int MIN_YEARS_AT_JOB = 2;

    static String mark(boolean ok) {
        return ok ? "✅" : "❌";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scan.nextInt();

        System.out.print("Monthly income: ");
        double income = scan.nextDouble();

        System.out.print("Credit score (0-100): ");
        int creditScore = scan.nextInt();

        System.out.print("Years at current job: ");
        double yearsAtJob = scan.nextDouble();

        System.out.print("Existing debt (true/false): ");
        boolean hasDebt = scan.nextBoolean();

        boolean ageOk = age >= MIN_AGE && age <= MAX_AGE;
        boolean incomeOk = income >= MIN_INCOME;
        boolean creditOk = creditScore >= MIN_CREDIT_SCORE;
        boolean stabilityOk = yearsAtJob >= MIN_YEARS_AT_JOB || !hasDebt;


        System.out.println("Age requirement : " + mark(ageOk));
        System.out.println("Income requirement : " + mark(incomeOk));
        System.out.println("Credit score requirement : " + mark(creditOk));

        if(ageOk && incomeOk && creditOk && stabilityOk) {
            System.out.print("Loan Approved : ✅");
        }else{
            System.out.print("Loan Rejected : ❌");
        }
    }
}
