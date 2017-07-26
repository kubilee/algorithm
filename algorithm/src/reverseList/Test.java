package reverseList;

public class Test {

    public static void main(String[] args) {
        Node head = new Node(1);
        buildList(head);
        System.out.println(printList(head));
        //        System.out.println(printList(reverseList(head)));
        System.out.println(printList(reverseList1(head)));
    }

    /**
     * 保持头指针不动 右侧逐渐改变 最终形成环状  断环
     * @author lichq
     * @Date 2017-7-26
     * @param head
     * @return
     */
    private static Node reverseList1(Node head) {
        Node tail, newHead = null;
        tail = head.next;
        while (tail.next != null) {
            newHead = tail.next;
            tail.next = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
        }
        head.next = null;
        tail.next = head;
        head = newHead;
        return head;
    }

    /**三个指针 分为左右两部分 左侧为反转完的部分  每次循环右侧向左移动一位
     * @author lichq
     * @Date 2017-7-26
     * @param head
     * @return
     */
    private static Node reverseList(Node head) {
        Node newHead, q, r;
        newHead = head;
        q = newHead.next;
        newHead.next = null;
        while (q != null) {
            r = q.next;
            q.next = newHead;
            newHead = q;
            q = r;
        }
        head = newHead;
        return head;
    }

    private static String printList(Node head) {
        StringBuilder sb = new StringBuilder();
        Node n = head;
        while (n != null) {
            sb.append(n.value);
            n = n.next;
        }
        return sb.toString();
    }

    private static void buildList(Node head) {
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        Node p5 = new Node(6);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;
    }

}