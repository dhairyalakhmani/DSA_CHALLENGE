class Solution {
    public int maxDistance(int side, int[][] points, int k) {
        long start = 0L;
        long end = 2L * side;
        int n = points.length;
        int ans = 0;
        long[] distances = new long[n];
        for(int i = 0; i < n; i++){
            int x = points[i][0];
            int y = points[i][1];
            if(x == 0) distances[i] = y;
            else if(y == side) distances[i] = side + x;
            else if(x == side) distances[i] = 3L * side - y;
            else distances[i] = 4L * side - x;
        }
        Arrays.sort(distances);
        while(start <= end){
            long mid = start + (end - start) / 2;
            if(check(mid, distances, side, k)){
                ans = (int) mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
    private boolean check(long gap, long[] distances, int side, int k){
        int n = distances.length;
        for(int start = 0; start < n; start++){
            long current = distances[start];
            int next = nextPoint(distances, current + gap);
            if(next == n) continue;
            int count = 2;
            while(count < k){
                int nextPossible = nextPoint(distances, distances[next] + gap);
                if(nextPossible == n) break;
                next = nextPossible;
                count++;
            }
            if(count < k) continue;
            else if(4L * side - (distances[next] - current) < gap) continue;
            return true; 
        }
        return false;
    }

    private int nextPoint(long[] distances, long target){
        int s = 0; int e = distances.length;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(distances[mid] >= target) e = mid;
            else s = mid + 1;
        }
        return s;
    }
}
