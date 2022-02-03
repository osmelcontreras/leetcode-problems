package com.leetcode.easy;

import java.util.HashMap;

public class TwoSumSolution {
	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] resultArray = new int[2];

		for (int i = 0; i < nums.length; i++) {

			int diff = 0;
			diff = target - nums[i];
			if (map.containsKey(diff)) {
				resultArray[0] = map.get(diff);
				resultArray[1] = i;

			} else {

				map.put(nums[i], i);
			}

		}

		return resultArray;
	}

}
