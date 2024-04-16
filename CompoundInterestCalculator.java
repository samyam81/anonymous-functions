import java.util.function.DoubleUnaryOperator;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.05;
        int years = 5;

        DoubleUnaryOperator compoundInterest = (p) -> p * Math.pow(1 + rate, years);

        double result = calculateCompoundInterest(principal, compoundInterest);
        System.out.println("Compound interest after " + years + " years: " + result);
    }

    public static double calculateCompoundInterest(double principal, DoubleUnaryOperator interestFunction) {
        return interestFunction.applyAsDouble(principal);
    }
}

