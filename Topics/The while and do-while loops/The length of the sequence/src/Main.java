import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput;
        int count = 0;
        
        do {
            userInput = scanner.nextInt();
            count++;      
        } while (userInput != 0);
        
        System.out.print(count - 1);
    }
}
/*
        while (userInput != 0) {
            count++;
            userInput = scanner.nextInt();
        }
*/