import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

         List<Integer> evenNumbers = filterEvenNumbers(numbers, n -> n % 2 == 0);
         System.out.println("Filtered Even Numbers: " + evenNumbers);         
    } 
    private static List<Integer> filterEvenNumbers(List<Integer> numbers, MyPredicate<Integer> predicate) {
        numbers.removeIf(n -> !predicate.test(n));

        return numbers;
    }
    
    @FunctionalInterface
    interface MyPredicate<T> {
        boolean test(T t);
    }
}
