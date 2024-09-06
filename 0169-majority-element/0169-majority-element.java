class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        for (int num : nums) {
            if (countOccurrences(nums, num) > nums.length / 2) {
                majorityElement = num;
                break;
            }
        }
        return majorityElement;
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int element : arr) {
            if (element == target) {
                count++;
            }
        }
        return count;
    }
}