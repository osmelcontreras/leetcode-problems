package com.leetcode.hard;

public class MedianOfTwoSortedArraysSolution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double median = 0.0;
		int left = 0;
		int right = 0;
		int ArIndex = 0;
		int m = nums1.length;
		int n = nums2.length;

		if (m == 0 && n == 0) {
			return 0;
		}

		int[] newArray = new int[m + n];

		while (left < m && right < n) {
			if (nums1[left] < nums2[right]) {
				newArray[ArIndex++] = nums1[left++];

			} else {
				newArray[ArIndex++] = nums2[right++];
			}
		}
		while (left < m) {
			newArray[ArIndex++] = nums1[left++];
		}

		while (right < n) {
			newArray[ArIndex++] = nums2[right++];
		}

		int len = newArray.length - 1;
		int midVal = (len) / 2; // index

		if ((len + 1) % 2 != 0) {
			median = newArray[midVal];
		} else {
			double calM = (newArray[midVal] + newArray[midVal + 1]) / 2.0;
			median = calM;
		}
		return median;
	}

}
