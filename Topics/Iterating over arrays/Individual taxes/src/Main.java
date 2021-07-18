import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // requirement is to fetch the index of max element in the array after the calculations
        int numberOfCompanies = scanner.nextInt();
        
        int[] incomesOfCompanies = new int[numberOfCompanies];
        int[] taxesOfCompanies = new int[numberOfCompanies];
        
        float max = 0;
        int indexOfMostTaxCompany = 0;

	    // Get the yearly incomes of each company
        for (int i = 0; i < numberOfCompanies; i++) {
            incomesOfCompanies[i] = scanner.nextInt();
        }
        
        // Get the percent of taxes each company pays
        for (int i = 0; i < numberOfCompanies; i++) {
            taxesOfCompanies[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            float tax = (float) (incomesOfCompanies[i] / 100.0 * taxesOfCompanies[i]);
            if (tax > max) {
                max = tax;
                indexOfMostTaxCompany = i + 1;
            }
        }
        
        System.out.println(indexOfMostTaxCompany);
    }
}
