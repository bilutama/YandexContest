package Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergingSequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int n = Integer.parseInt(tokenizer.nextToken());

        System.out.println(getElement(n));
    }

    private static long getElement(int n) {
        if (n == 1) {
            return 1;
        }

        int index = 0;
        long a;
        long b;

        long m = 1;

        for (long j = 1L; j <= n + 1; ++j) {
            b = j * j * j;

            for (long i = m; i <= n + 1; ++i) {
                ++m;

                a = i * i;

                if (a == b) {
                    continue;
                }

                if (a < b) {
                    ++index;
                    if (index == n) {
                        return a;
                    }

                    continue;
                }

                ++index;
                if (index == n) {
                    return b;
                }

                ++index;
                if (index == n) {
                    return a;
                }

                break;
            }

        }

        return 0;
    }
}
