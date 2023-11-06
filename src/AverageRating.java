import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageRating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("\\s+");
        int n = Integer.parseInt(strs[0]);

        int[] a = new int[n];
        strs = br.readLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }

        if (n < 2) {
            System.out.println(0);
            return;
        }

        int level = -a[0] * n;
        for (int e : a) {
            level += e;
        }

        System.out.printf(level + " ");

        for (int i = 1; i < n; ++i) {
            level += (2 * i - n) * (a[i] - a[i - 1]);
            System.out.printf(level + " ");
        }
    }
}
