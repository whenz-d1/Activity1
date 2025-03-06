public class ArithmeticSeriesSum {
    
    private int upperLimit;

   
    public ArithmeticSeriesSum(int upperLimit) {
        if (upperLimit < 1) {
            throw new IllegalArgumentException("Upper limit must be a positive integer.");
        }
        this.upperLimit = upperLimit;
    }

    
    public int calculateSum() {
        int sum = 0; 
        for (int i = 1; i <= upperLimit; i++) {
            sum += i; 
        }
        return sum;
    }

    
    public boolean validateSum(int calculatedSum) {
        int expectedSum = (upperLimit * (upperLimit + 1)) / 2; 
        return calculatedSum == expectedSum;
    }

    
    public void displayResult() {
        int sum = calculateSum();
        System.out.println("The sum of the arithmetic series from 1 to " + upperLimit + " is " + sum + ".");
        
        
        if (validateSum(sum)) {
            System.out.println("The calculated sum is validated against the formula n(n+1)/2.");
        } else {
            System.out.println("The calculated sum does not match the expected value from the formula.");
        }
    }

    
    public static void main(String[] args) {
        try {
            
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a positive integer as the upper limit: ");
            int limit = scanner.nextInt();
            ArithmeticSeriesSum seriesSum = new ArithmeticSeriesSum(limit);
            seriesSum.displayResult();
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}