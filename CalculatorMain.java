interface MathOperation {
    int perform(int a, int b);
}

class Calculator {
    void calculate(int x, int y, MathOperation mathOperation) {
        int result = mathOperation.perform(x, y);
        System.out.println("Result: " + result);
    }
}

class Addition implements MathOperation {
    @Override
    public int perform(int a, int b) {
        return a + b;
    }
}

class Subtraction implements MathOperation {
    @Override
    public int perform(int a, int b) {
        return a - b;
    }
}

class Multiplication implements MathOperation {
    @Override
    public int perform(int a, int b) {
        return a * b;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

          calculator.calculate(5, 3, new Addition());
          calculator.calculate(5, 3, new Subtraction());
          calculator.calculate(6, 7, new Multiplication());
    }
}
