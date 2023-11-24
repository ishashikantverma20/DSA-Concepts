/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 *  1 -> 2 -> 3 -> 4 -> 5 -> NULL
 *
 * NULL <- 1 <- 2 <- 3 <- 4 <- 5
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		//base case
		if(head == null || head.next == null) {
			return head;
		}

		// new head which need to return
		ListNode newHead = reverseList(head.next);

		// e.g. 1 -> 2 -> 1
		head.next.next = head;
		// 1 -> NULL and remove old link
		head.next = null;

		return newHead;


	}
}



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

