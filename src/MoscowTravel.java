import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoscowTravel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("\\s+");
        double x1 = Double.parseDouble(strs[0]);
        double y1 = Double.parseDouble(strs[1]);
        double x2 = Double.parseDouble(strs[2]);
        double y2 = Double.parseDouble(strs[3]);

        double r1 = getRadius(x1, y1);
        double r2 = getRadius(x2, y2);
        double a = getAngle(x1, y1, x2, y2);

        System.out.println("angle=" + a);

        double path = a > 2 ? (r1 + r2) : (a * Math.min(r1, r2) + Math.abs(r1 - r2));

        System.out.println(path);
    }

    public static double getAngle(double x1, double y1, double x2, double y2) {
        double a1 = Math.atan2(x1, y1);
        double a2 = Math.atan2(x2, y2);

        if (a1 == 0.0 || a2 == 0.0) {
            return 0.0;
        }

        return Math.abs(a2 - a1) > Math.PI ? Math.PI - Math.abs(a2 - a1) : Math.abs(a2 - a1);
    }

    public static double getRadius(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}
