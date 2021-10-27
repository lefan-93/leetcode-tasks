public class Solution {
    public int searchInsert(int[] nums, int target) {

        if (nums.length == 1) {
            if (nums[0] >= target) {
                return 0;
            } else return 1;
        }

        int start = 0;
        int finish = nums.length - 1;
        int size = nums.length;

        return search(nums, start, finish, target);
    }

    private int search(int[] nums, int start, int finish, int target) {

        int result = -1;

        if (nums[start] >= target) {
            return start;
        }

        if (nums[finish] == target) {
            return finish;
        }

        if (nums[finish] < target) {
            return finish + 1;
        }

        int mid = (start + finish) / 2;
        int result1 = search(nums, start, mid, target);
        int result2 = search(nums, mid + 1, finish, target);

        if (result1 == result2) {
            result = result1;
        } else if (nums[mid] >= target) {
            result = result1;
        } else result = result2;

        return result;
    }
}
