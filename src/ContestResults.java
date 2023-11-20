import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContestResults {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(tokenizer.nextToken());

        str = br.readLine();
        tokenizer = new StringTokenizer(str);
        int b = Integer.parseInt(tokenizer.nextToken());

        str = br.readLine();
        tokenizer = new StringTokenizer(str);
        int n = Integer.parseInt(tokenizer.nextToken());

        if (a > (b + n - 1) / n) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
