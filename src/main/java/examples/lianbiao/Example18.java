package examples.lianbiao;
//环形链表
public class Example18 {
    public boolean hasCycle(ListNode head) {
        if(head == null ||head.next == null) {
            return false;
        }
        ListNode slow = head,fast = head.next;
        while(slow != fast) {
            if(fast.next == null || fast.next.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }
}
