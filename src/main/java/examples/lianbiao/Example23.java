package examples.lianbiao;
//两两交换链表中的节点
public class Example23 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode dunny = new ListNode(-1);
        dunny.next = head;
        ListNode pre = dunny;
        ListNode cur = head;
        ListNode nextNode = head.next;
        while(cur!=null && nextNode!=null) {
            ListNode temp = nextNode.next;
            nextNode.next = cur;
            cur.next = temp;
            pre.next = nextNode;
            pre = cur;
            cur = temp;
            if(cur!=null) {
                nextNode = cur.next;
            }else {
                break;
            }

        }
        return dunny.next;
    }
}
