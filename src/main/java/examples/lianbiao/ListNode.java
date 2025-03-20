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
public class ListNode {
    // 结点的值
    int val;

    // 下一个结点
    ListNode next;

    // 节点的构造函数(无参)
    public ListNode() {
    }

    // 节点的构造函数(有一个参数)
    public ListNode(int val) {
        this.val = val;
    }

    // 节点的构造函数(有两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
