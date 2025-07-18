package lambdastrategy;

import java.util.List;
import java.util.function.Predicate;

public class Refactored {
    public static int sumByTest(List<Integer> nums, Predicate<Integer> selector) {
        int sum = 0;
        for(int num: nums) {
            if(selector.test(num)) {
                sum += num;
            }
        }
        return sum;
    }


    public static int sumByTestRefactored(List<Integer> nums, Predicate<Integer> selector) {
        return nums.stream()
                .filter(selector)
                .mapToInt(Integer::intValue).sum();
    }

    /**
     Interface Predicate {
     boolean test();
     }
     */



    public static void main(String[] args) {
        System.out.println(sumByTestRefactored(List.of(1,2,3,4,5), NumberTests::passAll));
        System.out.println(sumByTestRefactored(List.of(1,2,3,4,5,6,7,8,9,10), (x) -> true));
        System.out.println(sumByTestRefactored(List.of(1,2,3,4,5), NumberTests::isEven));
        System.out.println(sumByTestRefactored(List.of(1,2,3,4,5), NumberTests::isOdd));

        System.out.println(sumByTestRefactored(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,1,4,15), NumberTests::isPrime));

        System.out.println(sumByTestRefactored(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,1,4,15), NumberTests::isFibonacci));
    }
}