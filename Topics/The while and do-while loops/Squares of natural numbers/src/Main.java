import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = scanner.nextInt();
        int positiveInteger = 1;       
        int squared = positiveInteger * positiveInteger;
        
        while (squared <= userInput) {
            System.out.println(squared);
            positiveInteger++;
            squared = positiveInteger * positiveInteger;
        }
    }
}
