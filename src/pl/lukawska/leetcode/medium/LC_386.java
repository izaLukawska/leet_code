package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> numbers = new ArrayList<>();

        int current = 1;

        for (int i = 0; i < n; i++) {
            numbers.add(current);

            if (current * 10 <= n) {
                current = current * 10;
            } else {
                while (current % 10 == 9 || current + 1 > n) {
                    current = current / 10;
                }
                current++;
            }
        }

        return numbers;
    }
}
