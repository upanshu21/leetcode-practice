package medium;

public class AddTwoNumbers {


     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry = 0;
            ListNode result = new ListNode();
            ListNode temp = result;
            while (l1 != null || l2 != null) {
                int sum = 0;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                sum += carry;
                carry = sum/10;

                temp.next = new ListNode(sum%10);
                temp = temp.next;
            }
            return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 1;
//        l1 = l1.next;
//        l1.val = 2;
//        l1 = l1.next;
//        l1.val = 3;
//        l1 = l1.next;

        ListNode l2 = new ListNode();
        l2.val = 1;
//        l2 = l2.next;
//        l2.val = 2;
//        l2 = l2.next;
//        l2.val = 3;
//        l2 = l2.next;
        ListNode a = addTwoNumbers(l1, l2);
        System.out.println(a.val);
    }

}
