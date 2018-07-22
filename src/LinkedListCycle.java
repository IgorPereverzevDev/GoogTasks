import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        var slow = head;
        var fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    public boolean hasCycle2(ListNode head) {
        Set <ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;

    }
}

