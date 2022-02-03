package com.leetcode.easy;

public class isPalindromeSolution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		int originalNum = x;
		int reminder = 0;
		int reversedNum = 0;

		while (x != 0) {
			reminder = x % 10; // 1
			// System.out.println("\nreminder:"+ reminder);

			reversedNum = reversedNum * 10 + reminder;
			// System.out.println("\nreversedNum:" +reversedNum );

			x /= 10;
			// System.out.println("\nx/10:" +x );

		}
		if (originalNum == reversedNum) {
			return true;
		} else {
			return false;
		}

	}
}
