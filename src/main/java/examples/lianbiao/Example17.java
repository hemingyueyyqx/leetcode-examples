package examples.lianbiao;
//回文链表
public class Example17 {
    public boolean isPalindrome(ListNode head) {
     if(head==null || head.next==null) {
         return true;
     }
     //快慢指针找中点
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = reverse(slow.next);
        ListNode left = head;
        while(right!=null) {
            if(right.val!=left.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode left = head,right=head.next;
        left.next = null;
        while(right != null) {
            ListNode temp = right.next;
            right.next = left;
            left = right;
            right = temp;
        }
        return left;
    }
}
