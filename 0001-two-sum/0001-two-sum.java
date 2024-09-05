class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] indices = new int[2];
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target)
                    indices = new int[]{i, j};
                if (indices[0] > 0 || indices[1] > 0)
                    break;
            }
            if (indices[0] > 0 || indices[1] > 0)
                break;
        }
        return  indices;
    }
}