package com.leetcode.easy;

public class LongestCommonPrefixSolution {
	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) {
			return "";
		}

		int start = 0;
		String ans = "";
		int len = Integer.MAX_VALUE;

		for (int i = 0; i < strs.length; i++) {
			len = Math.min(len, strs[i].length());
			System.out.println(len);
		}
		while (start < len) {
			for (int i = 0; i < strs.length - 1; i++) {
				if (strs[i].charAt(start) != strs[i + 1].charAt(start))

					return ans;

			}
			ans = ans + strs[0].charAt(start);
			start++;
			System.out.println(ans);
		}
		return ans;
	}
}
