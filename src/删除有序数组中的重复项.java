public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return 1;
        }

        int idx = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[idx] != nums[i]) {
                nums[++idx] = nums[i];
            }
        }

        return idx + 1;
    }
}
