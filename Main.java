import Algorithms.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] givenNums = new int[]{4, 7, 5, 2};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        Arrays.stream(twoSum.twoSum(givenNums, target))
                .forEach(System.out::println);
    }
}
