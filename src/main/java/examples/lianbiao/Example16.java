package examples.lianbiao;
//反转链表
public class Example16 {
    public ListNode reverseList(ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode left = head;
        ListNode right = head.next;
        left.next = null;
        while(right!=null) {
            ListNode temp = right.next;
            right.next = left;
            left = right;
            right = temp;
        }
        return left;
    }
}
