import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean hasCrashed = false;
        
        for (int i = 1; i <= numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.printf("\nWill crash on bridge %d", i);
                hasCrashed = true;
                break;
            }
        }
        
        if (!hasCrashed) {
            System.out.println("Will not crash");
        }
    }
}
