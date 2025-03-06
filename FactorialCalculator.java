public class FactorialCalculator {
    // Private attribute to store the number
    private int number;

    
    public FactorialCalculator(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be a non-negative integer.");
        }
        this.number = number;
    }

    
    public long calculateFactorial() {
        long factorial = 1; 
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    
    public void displayResult() {
        long factorial = calculateFactorial();
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }

    
    public static void main(String[] args) {
        try {
            
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a non-negative integer: ");
            int num = scanner.nextInt();
            FactorialCalculator calculator = new FactorialCalculator(num);
            calculator.displayResult();
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}