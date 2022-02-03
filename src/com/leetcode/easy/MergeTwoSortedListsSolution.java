package com.leetcode.easy;

// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeTwoSortedListsSolution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// we have to make a dummy linkedList as the function wants ListNode as return
		// type so it can never be in-place that's why we always need to use extra space
		// over here

		// Initially dummy is empty or you can say it is null
		ListNode head = new ListNode();
		// we need another pointer reference for dummy variable
		ListNode current = head;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				current.next = new ListNode(list1.val);
				list1 = list1.next;
			} else {
				current.next = new ListNode(list2.val);
				list2 = list2.next;
			}
			current = current.next;
		}

		while (list1 != null) {
			current.next = new ListNode(list1.val);
			list1 = list1.next;
			current = current.next;
		}

		while (list2 != null) {
			current.next = new ListNode(list2.val);
			list2 = list2.next;
			current = current.next;
		}
		return head.next;

	}
}
