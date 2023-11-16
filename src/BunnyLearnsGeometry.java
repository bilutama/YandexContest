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

        int[][] a = new int[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                str = br.readLine();
                tokenizer = new StringTokenizer(str);
                a[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        // main algorithm

    }
}
