import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];
        
        int counterBox1 = 0;
        int counterBox2 = 0;
        
        for (int i = 0; i < firstBox.length; i++) {
            firstBox[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < secondBox.length; i++) {
            secondBox[i] = scanner.nextInt();
        }
        
        Arrays.sort(firstBox);
        Arrays.sort(secondBox);
        
        for (int i = 0; i < firstBox.length; i++) {
            if (firstBox[i] > secondBox[i]) {
                counterBox1++;
            } else if (firstBox[i] < secondBox[i]) {
                counterBox2++;
            }
        }

        if (counterBox1 == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (counterBox2 == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
