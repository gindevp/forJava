import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate =1.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter invest");
        money = scanner.nextDouble();
        System.out.println("months");
        month = scanner.nextInt();
        System.out.println("rnter rate");
        interestRate = scanner.nextDouble();
        double totalInterest=0;
        for (int i = 0; i <month ; i++) {
            totalInterest+=money*(interestRate*100)/12*month;

        }
        System.out.println("sdjd"+totalInterest);

    }
}
