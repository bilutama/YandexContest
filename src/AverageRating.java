import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class AverageRating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);

        int n = Integer.parseInt(tokenizer.nextToken());

        String nums = br.readLine();
        tokenizer = new StringTokenizer(nums);

        int[] a = new int[n];
        int[] level = new int[n];

        int temp = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
            level[i] = a[i] * i - temp;
            temp += a[i];
        }

        PrintWriter writer = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        temp = 0;
        for (int j = n - 1; j >= 0; --j) {
            level[j] += temp - a[j] * (n - j - 1);
            temp += a[j];
            sb.insert(0, level[j] + " ");
        }

        writer.println(sb);
        writer.close();
    }
}
