package com.leetcode.medium;

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

public class AddTwoNumbersSolution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Create a Dummy Node to Fixed Head of the Answer
		ListNode head = new ListNode();

		// Temp Pointer will Traverse and Create the Linked List.
		ListNode temp = head;

		// Carry Variable to Store the Carry.
		int carry = 0;

		if (l1 == null && l2 == null) {
			return head;
		}

		// If Carry is 1 then it will be Added.
		while (l1 != null || l2 != null || carry == 1) {

			int sum = 0;

			System.out.println("\nSum:" + sum);
			System.out.println("\nCarry:" + carry);

			// If l1 is not Null then add it's Value and Move it to Next.
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			// If l2 is not Null then add it's Value and Move it to Next.
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			// Adding Carry to Sum.
			sum += carry;
			System.out.println("First carry sum: " + sum);

			// Create New Node Using Modulo Operator.
			ListNode addNext = new ListNode(sum % 10);

			// Storing Carry.
			carry = sum / 10;
			System.out.println("Storing carry: " + carry);

			// Point the New Node to Next of the Node.
			temp.next = addNext;
			temp = temp.next;
		}

		// Return Next of head because
		// head point to the Node which Value is -1.
		return head.next;
	}
}
