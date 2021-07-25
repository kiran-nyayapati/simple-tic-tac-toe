import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        String input = scanner.next();
        
        switch (input) {
            case "triangle":
                double sideA = scanner.nextDouble();
                double sideB = scanner.nextDouble();
                double sideC = scanner.nextDouble();
                calculateTriangleFloorage(sideA, sideB, sideC);
                break;
            case "rectangle":
                sideA = scanner.nextDouble();
                sideB = scanner.nextDouble();
                calculateRectangleFloorage(sideA, sideB);
                break;
            case "circle":
                double radius = scanner.nextDouble();
                calculateCircleFloorage(radius);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);    
        }
    }

    private static void calculateCircleFloorage(double radius) {
        System.out.println(3.14 * radius * radius);
    }

    private static void calculateRectangleFloorage(double sideA, double sideB) {
        System.out.println(sideA * sideB);
    }

    private static void calculateTriangleFloorage(double sideA, double sideB, double sideC) {
        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            double perimeterOfTriangle = sideA + sideB + sideC;
            double semiPerimeter = perimeterOfTriangle / 2;
            // Heron's Formula below:
            double areaOfTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * 
                                    (semiPerimeter - sideB) * (semiPerimeter - sideC));
            System.out.println(areaOfTriangle);
        }
    }
}
