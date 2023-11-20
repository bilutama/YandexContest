import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BunnyLearnsGeometry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int rowCount = Integer.parseInt(tokenizer.nextToken());
        int columnCount = Integer.parseInt(tokenizer.nextToken());

        int[][] counts = new int[rowCount + 1][columnCount + 1];
        int maxSize = 0;

        for (int i = 1; i <= rowCount; i++) {
            str = br.readLine();
            tokenizer = new StringTokenizer(str);

            for (int j = 1; j <= columnCount; j++) {
                int e = Integer.parseInt(tokenizer.nextToken());

                if (e == 1) {
                    counts[i][j] = min(counts[i - 1][j - 1], counts[i - 1][j], counts[i][j - 1]) + 1;

                    if (counts[i][j] > maxSize) {
                        maxSize = counts[i][j];
                    }
                }
            }
        }

        System.out.println(maxSize);
    }

    public static int min(int a, int b, int c) {
        return Math.min((Math.min(a, b)), c);
    }
}
