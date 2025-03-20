package examples.lianbiao;
//合并两个有序链表
public class Example20 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //边界条件
        if(list1==null) {
            return list2;
        }
        if(list2==null) {
            return list1;
        }
        // 创建头结点
        ListNode head = new ListNode();
        ListNode p1 = list1,p2 = list2,p3 = head;
        // 循环比较
        while(p1!=null&&p2!=null) {
            if(p1.val<p2.val) {
                p3.next = p1;
                p1 = p1.next;
            } else {
                p3.next = p2;
                p2 = p2.next;
            }

            p3 = p3.next;
        }
        // 循环结束后，p1或p2不为空，将p1或p2挂载到p3后面
        p3.next = p1==null?p2:p1;
        return head.next;
    }
}
