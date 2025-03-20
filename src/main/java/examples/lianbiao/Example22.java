package examples.lianbiao;
//删除链表的倒数第 N 个结点
public class Example22 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // 快指针先走n步
        while(n-- > 0) {
            fast = fast.next;
        }
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
