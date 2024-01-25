import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number{
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(9,1,2,43,5,-234,23,6,7,19);
        filterNumbers(number, (Number)-> isPositive(Number));
        filterNumbers(number,(Number)-> Number %3==0);
    }
    public static void filterNumbers(List<Integer> numbers,NumberFilter filter){
        List<Integer> filteredNumbers = new ArrayList<>();
		for(Integer number : numbers) {
			if(filter.filterNumbers(number)) {
				filteredNumbers.add(number);
			}
		}
		System.out.println(filteredNumbers);
    }
    public static boolean isPositive(int number){
          return (number>0)?true:false;
    }
}
