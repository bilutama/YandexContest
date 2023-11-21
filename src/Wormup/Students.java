package Wormup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Students {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int t = Integer.parseInt(tokenizer.nextToken());

        int[] n = new int[t];
        int[] a = new int[t];
        int[] b = new int[t];

        for (int i = 0; i < t; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            n[i] = Integer.parseInt(tokenizer.nextToken());
            a[i] = Integer.parseInt(tokenizer.nextToken());
            b[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < t; ++i) {
            long x = ((long) n[i] / a[i]) * (b[i] - a[i]);
            long y = ((long) n[i] - (long) (n[i] / a[i]) * a[i]);

            if (x >= y) {
                System.out.println("YES");
                continue;
            }

            System.out.println("NO");
        }
    }
}
