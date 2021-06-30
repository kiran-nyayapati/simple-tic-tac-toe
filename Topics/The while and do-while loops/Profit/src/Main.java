import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double initialDeposit = scanner.nextDouble();
        double percentage = scanner.nextDouble();
        double maturedAmount = scanner.nextDouble();
        int yearsToPass = 0;
        
        while (initialDeposit < maturedAmount) {
            initialDeposit = initialDeposit + initialDeposit * (percentage / 100);
            yearsToPass++;
        }
        System.out.println(yearsToPass);
    }
}
