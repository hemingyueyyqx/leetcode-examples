package examples.lianbiao;
//排序链表
public class Example26 {
    public ListNode sortList(ListNode head) {
        // 递归终止条件
        if (head == null || head.next == null) {
            return head;
        }
        // 找到链表中点，并断开链表
        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;
        // 递归对左右链表进行排序
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);
        // 合并左右链表
        return merge(leftSorted, rightSorted);
    }
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        cur.next = left!= null ? left : right;
        return dummy.next;
    }

}
