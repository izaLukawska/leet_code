package pl.lukawska.leetcode.medium;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LC_347 {
    public int[] topKFrequent(int[] nums, int k) {
        return IntStream.of(nums)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(k)
                        .mapToInt(Map.Entry::getKey)
                        .toArray();
    }
}
