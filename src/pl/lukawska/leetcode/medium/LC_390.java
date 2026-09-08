package pl.lukawska.leetcode.medium;

public class LC_390 {
    public int lastRemaining(int n) {
        int head = 1;
        int gap = 1;
        int count = n;
        boolean direction = true;

        while (count > 1) {
            if (direction || count % 2 == 1) {
                head += gap;
            }

            count /= 2;
            gap *= 2;
            direction = !direction;
        }

        return head;
    }
}
