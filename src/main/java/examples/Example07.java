package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//合并区间
public class Example07 {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
        for(int[] interval : intervals) {
            if(res.isEmpty() || interval[0] > res.get(res.size()-1)[1]) {
                res.add(interval);
            } else {
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], interval[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
