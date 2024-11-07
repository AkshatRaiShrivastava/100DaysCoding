import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingIntervals {
    public static List<int[]> mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{intervals[0][0],intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int last[] = result.get(result.size()-1);
            int curr[] = intervals[i];

            if (curr[0]<=last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            }else{
                result.add(new int[]{curr[0],curr[1]});
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 4 }, { 6, 8 }, { 9, 10 } };
        List<int[]> result= mergeIntervals(intervals);
        for (int[] interval : result) {
            System.out.println(interval[0]+" "+interval[1]);
        }
    }
}
