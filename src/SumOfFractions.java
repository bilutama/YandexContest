import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfFractions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("\\s+");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);
        int d = Integer.parseInt(strs[3]);

        int gcd = getGcd(a * d + b * c, b * d);
        int m = (a * d + b * c) / gcd;
        int n = (b * d) / gcd;

        System.out.println(m + " " + n);
    }

    public static int getGcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return getGcd(y, (x % y));
        }
    }
}
