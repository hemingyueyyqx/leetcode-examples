package examples.lianbiao;

import java.util.HashMap;
import java.util.Map;

//随机链表的复制
public class Example25 {
    Map<Node,Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        // 递归终止条件
        if(head == null) {
            return null;
        }
        // 创建新结点，并把原结点的值赋给新结点
        Node newHead = new Node(head.val);
        // 把原结点与新结点存入map中
        map.put(head,newHead);
        // 递归调用
        newHead.next = copyRandomList(head.next);
        // 如果原结点的random结点不为空，则把原结点的random结点对应的新结点赋给新结点的random结点
        newHead.random = map.get(head.random);
        return newHead;
    }
}
