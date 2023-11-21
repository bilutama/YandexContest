package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NotMinimumOnSegment {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        int[] nums = new int[n];
        strs = br.readLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        for (int j = 0; j < m; ++j) {
            if (n == 0 || n == 1) {
                System.out.println("NOT FOUND");
            }

            strs = br.readLine().split("\\s+");
            int L = Integer.parseInt(strs[0]);
            int R = Integer.parseInt(strs[1]);

            if (L < 0 || L > n || R < 0 || R > n || L == R) {
                System.out.println("NOT FOUND");
                return;
            }

            int p = nums[L];
            boolean isFound = false;

            for (int k = L + 1; k <= R; ++k) {
                if (nums[k] > p) {
                    System.out.println(nums[k]);
                    isFound = true;
                    break;
                }

                if (nums[k] < p) {
                    System.out.println(p);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("NOT FOUND");
            }
        }
    }
}