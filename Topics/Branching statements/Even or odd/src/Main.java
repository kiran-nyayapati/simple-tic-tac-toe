import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int userInput = scanner.nextInt();
            
            if (userInput == 0) {
                break;
            } else if (userInput % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
