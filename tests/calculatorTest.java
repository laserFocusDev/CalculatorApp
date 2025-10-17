import calculator.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Test 1: 2+3*4 = " + calc.evaluate("2+3*4")); // Expected 14
        System.out.println("Test 2: (2+3)*4 = " + calc.evaluate("(2+3)*4")); // Expected 20
        System.out.println("Test 3: 10/2+6 = " + calc.evaluate("10/2+6")); // Expected 11
        System.out.println("Test 4: 5*(6-2) = " + calc.evaluate("5*(6-2)")); // Expected 20
    }
}
