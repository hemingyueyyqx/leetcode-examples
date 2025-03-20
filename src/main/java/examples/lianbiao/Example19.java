package examples.lianbiao;
//环形链表 II
public class Example19 {
    public ListNode detectCycle(ListNode head) {
     if(head==null || head.next==null) {
         return null;
     }
     // 快慢指针
     ListNode slow = head;
     ListNode fast = head;
     boolean flag = false;
     // 快指针追上慢指针，则存在环
     while(fast!=null && fast.next!=null) {
         slow = slow.next;
         fast = fast.next.next;
         if(slow==fast) {
             flag = true;
             break;
         }
     }
     if(!flag) {
         return null;
     }
     // 快指针从head开始，慢指针从slow开始，则相遇点就是入环点
     fast = head;
     while(slow!=fast) {
         slow = slow.next;
         fast = fast.next;
     }
     return slow;
    }
}
