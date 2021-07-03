import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        while (scanner.hasNext()) {    
            int userInput = scanner.nextInt();
            
            sum += userInput;
            
            if (userInput == 0) {      
                break;
            }
            
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.print(sum);
    }
}
