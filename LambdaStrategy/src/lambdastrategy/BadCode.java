package lambdastrategy;

import java.util.List;

public class BadCode {
    public static int sumOfAllNum(List<Integer> nums) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }


    public static int sumOfAllOdd(List<Integer> nums) {
        int sum = 0;
        for(int num : nums) { // for-each loop
            if(num % 2 != 0) {      // this is test condition which change every time
                sum += num;
            }
        }
        return sum;
    }

    public static int sumOfAllEven(List<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            if(num % 2 == 0) {  // this is test condition which change every time
                sum += num;
            }
        }
        return sum;
    }
}

/*
* Here we see that we repeat ourself everytime which is not want
* avoiding DRY Principle
*
*
* Concept of Predicate
* which is some kind of test which return either true or false. it is holding lambda function
*
* syntax
*  as we apply test on integer
*
*   Predicate<Integer> isOdd = (x) => (x) % 2 != 0
    isOdd.test(5)
*
* Predicate<Object>
*
*
* */
