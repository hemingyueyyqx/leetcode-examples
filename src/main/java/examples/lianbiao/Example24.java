package examples.lianbiao;
//K 个一组翻转链表
public class Example24 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 记录前k个节点的前一个节点
        ListNode preGroup = dummy;
        while (true) {
            // 记录前k个节点
            ListNode curGroup = preGroup.next;
            // 用于找到当前组的最后一个节点
            ListNode tail = preGroup;
            // 找到当前组的最后一个节点
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return dummy.next;
                }

            }
            // 保存下一组的第一个节点
            ListNode nextGroup = tail.next;
            // 断开当前组的连接
            tail.next = null;
            // 翻转当前组
            preGroup.next = reverse(curGroup);
            // 连接翻转后的当前组和下一组
            curGroup.next = nextGroup;
            // 更新前k个节点的前一个节点
            preGroup = curGroup;
        }

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
