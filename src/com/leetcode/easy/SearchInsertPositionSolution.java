package com.leetcode.easy;

public class SearchInsertPositionSolution {
	public int searchInsert(int[] nums, int target) {
		int start = 0;
		int pivot = 0;
		int end = nums.length - 1;

		while (start <= end) {

			pivot = start + (end - start) / 2;

			if (target == nums[pivot]) {
				return pivot;
			}

			else if (target > nums[pivot]) {
				start = pivot + 1;
			} else {
				end = pivot - 1;
			}
		}

		return end + 1;
	}
}
