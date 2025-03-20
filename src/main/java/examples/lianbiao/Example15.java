package examples.lianbiao;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 ListNode(int x)：这是 ListNode 类的构造方法，它接收一个整数类型的参数 x。
 val = x;：将传入的参数 x 赋值给成员变量 val，这样节点就有了具体的值。
 next = null;：把成员变量 next 初始化为 null，意味着在创建这个节点时，它暂时没有指向任何下一个节点。在后续构建链表的过程中，可以根据需求修改 next 的指向。
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//相交链表
public class Example15 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA==null||headB==null) {
        return null;
    }
    ListNode pA=headA,pB=headB;
    while(pA!=pB) {
        pA=pA==null?headB:pA.next;
        pB=pB==null?headA:pB.next;
    }
    return pA;
    }
}
