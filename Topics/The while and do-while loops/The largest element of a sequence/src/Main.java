import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNumber = 0;
        int userInput;
        
        do {
            userInput = scanner.nextInt();          
            if (userInput > maxNumber) {
                maxNumber = userInput;
            }    
        } while (userInput != 0);
        
        System.out.format("%d", maxNumber);
    }
}
