package com.leetcode.easy;

public class RemoveElementSolution {
	public int removeElement(int[] nums, int val) {

		if (nums.length == 0) {
			return 0;
		}

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (val != nums[i]) {
				nums[k++] = nums[i];
				System.out.println("Iteration:" + i + ", k Value:" + k);

			}
		}
		System.out.println(k);
		System.out.println(nums.length);

		return k;
	}
}
