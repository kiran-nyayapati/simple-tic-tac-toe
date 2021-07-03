import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        int previousNumber = scanner.nextInt();
        int currentNumber;
        int ascending = 0;
        int descending = 0;
        
        while ((currentNumber = scanner.nextInt()) != 0) {
            if (currentNumber > previousNumber) {
                ascending++;
            } else if (currentNumber < previousNumber) {
                descending++;
            }
            previousNumber = currentNumber;
        }
        boolean isOrdered = ascending == 0 || descending == 0;
        System.out.println(isOrdered);
    }
}
