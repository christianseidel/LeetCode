package leetcode.challenges.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {

    @Test
    void shouldAddUptoNine() {
        // given
        SumOfTwo sum = new SumOfTwo();

        // when
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] actual = {0, 1};

        // then
        Assertions.assertArrayEquals(actual, sum.twoSum(nums, target));

    }

    @Test
    void shouldAddUpToSix() {
        // given
        SumOfTwo sum = new SumOfTwo();

        // when
        int[] nums = {3,3};
        int target = 6;
        int[] actual = {0, 1};

        // then
        Assertions.assertArrayEquals(actual, sum.twoSum(nums, 6));
    }

    @Test
    void shouldAddUpToTwentyFive() {
        // given
        SumOfTwo sum = new SumOfTwo();

        // when
        int[] nums = {6, 4, 8, 500, 780, 7, 13, 3, 11, 18, 23, 504, 307, 77, 17, 120};
        int target = 25;
        int[] actual = {5, 9};

        // then
        System.out.println("here: " + sum.twoSum(nums, target)[0] + " and " + sum.twoSum(nums, target)[1]);
        Assertions.assertArrayEquals(actual, sum.twoSum(nums, target));


    }
}