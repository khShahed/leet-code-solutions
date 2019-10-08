package Algorithms;

import utils.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = null;
        ListNode previousNode = null;
        boolean carry = false;

        while (l1 != null || l2 != null){
            int firstNumber = carry ? 1 : 0;
            int secondNumber = 0;

            if (l1 != null) {
                firstNumber += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                secondNumber = l2.val;
                l2 = l2.next;
            }

            int total = 0;
            if (firstNumber + secondNumber >= 10) {
                carry = true;
                total = (firstNumber + secondNumber) % 10;
            } else{
                carry = false;
                total = firstNumber + secondNumber;
            }

            ListNode currentNode = new ListNode(total);
            if (firstNode == null) {
                firstNode = currentNode;
            }
            else {
                previousNode.next = currentNode;
            }
            previousNode = currentNode;

            if (carry && l1 == null && l2 == null) {
                previousNode.next = new ListNode(1);
            }
        }
        return firstNode;
    }
}
