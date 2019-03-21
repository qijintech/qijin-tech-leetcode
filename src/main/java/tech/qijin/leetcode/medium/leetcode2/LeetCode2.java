package tech.qijin.leetcode.medium.leetcode2;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author michealyang
 * @date 2019/3/21
 * 开始做眼保健操：←_← ↑_↑ →_→ ↓_↓
 **/
@Slf4j
public class LeetCode2 {

    @ToString
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        /**
         * <p>
         * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
         * Output: 7 -> 0 -> 8
         * Explanation: 342 + 465 = 807.
         * </p>
         *
         * @param l1
         * @param l2
         * @return
         */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            ListNode p1 = l1, p2 = l2, head = null, p = null;
            int x = 0;
            while (p1 != null && p2 != null) {
                int val = p1.val + p2.val + x;
                x = val / 10;
                ListNode node = new ListNode(val % 10);
                if (p == null) {
                    p = node;
                    head = p;
                } else {
                    p.next = node;
                    p = p.next;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            while (p1 != null) {
                int val = p1.val + x;
                x = val / 10;
                p.next = new ListNode(val % 10);
                p1 = p1.next;
                p = p.next;
            }
            while (p2 != null) {
                int val = p2.val + x;
                x = val / 10;
                p.next = new ListNode(val % 10);
                p2 = p2.next;
                p = p.next;
            }
            if (x > 0) {
                p.next = new ListNode(x);
            }
            return head;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        log.info("res={}", listNode);
    }
}
