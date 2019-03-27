package tech.qijin.leetcode.easy.leetcode771;

import lombok.extern.slf4j.Slf4j;

/**
 * @author michealyang
 * @date 2019/3/22
 * 开始做眼保健操：←_← ↑_↑ →_→ ↓_↓
 **/
@Slf4j
public class LeetCode771 {
    static class Solution {
        /**
         * <pre>
         * Input: J = "aA", S = "aAAbbbb"
         * Output: 3
         * </pre>
         *
         * @param J
         * @param S
         * @return
         */
        public int numJewelsInStones(String J, String S) {
            byte[] chars = S.getBytes();
            int sum = 0;
            for (byte c : chars) {
                if (J.contains(String.valueOf((char)c))) {
                    sum++;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAbbbb";
        log.info("res={}", new Solution().numJewelsInStones(j, s));
    }
}
