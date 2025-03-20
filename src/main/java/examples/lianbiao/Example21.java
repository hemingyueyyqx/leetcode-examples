package examples.lianbiao;
//两数相加
public class Example21 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null || carry != 0) {
              int sum = carry;
              if(p != null) {
                 sum += p.val;
                 p = p.next;
              }
              if(q != null) {
                  sum += q.val;
                  q = q.next;
              }
              carry = sum / 10;
              curr.next = new ListNode(sum % 10);
              curr = curr.next;


        }
        return dummyHead.next;
    }
}
