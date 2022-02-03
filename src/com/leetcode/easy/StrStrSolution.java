package com.leetcode.easy;

public class StrStrSolution {
	public int strStr(String haystack, String needle) {

		int solution = 0;

		if (needle.isEmpty()) {
			return 0;
		}

		if (haystack.isEmpty()) {
			return -1;
		}

		if (!needle.isEmpty() && !haystack.isEmpty() && haystack.length() >= needle.length()) {
			if (haystack.contains(needle)) {
				solution = haystack.indexOf(needle);
			} else {

				solution = -1;
			}
		} else {
			solution = -1;
		}

		return solution;
	}
}
