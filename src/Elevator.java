import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int capacity = Integer.parseInt(tokenizer.nextToken());

        str = br.readLine();
        tokenizer = new StringTokenizer(str);
        int n = 1 + Integer.parseInt(tokenizer.nextToken());

        int[] a = new int[n];

        a[0] = 0;
        for (int i = 1; i < n; i++) {
            str = br.readLine();
            tokenizer = new StringTokenizer(str);
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }

        if (n < 2) {
            System.out.println(0);
        }

        // Algorithm
        long t = 2L * ((a[n - 1] + capacity - 1) / capacity) * (n - 1);
        int capacityLeft = 0;

        if (a[n - 1] > 0) {
            capacityLeft = capacity > a[n - 1] ?
                    capacity - a[n - 1] :
                    (a[n - 1] % capacity == 0 ? 0 : capacity - a[n - 1] % capacity);
        }

        int peopleOnCurrentFloor;
        long curTime;

        System.out.println("capacity=" + capacityLeft + "; time=" + t);

        for (int i = n - 2; i > 0; --i) {
            capacityLeft -= a[i];

            if (capacityLeft >= 0) {
                System.out.println("capacity=" + capacityLeft + "; time=0");
                continue;
            }

            peopleOnCurrentFloor = -capacityLeft;
            // New capacityLeft value
            capacityLeft = capacity >= peopleOnCurrentFloor ?
                    capacity - peopleOnCurrentFloor :
                    (peopleOnCurrentFloor % capacity == 0 ? 0 : capacity - peopleOnCurrentFloor % capacity);

            curTime = 2L * i * ((peopleOnCurrentFloor + capacity - 1) / capacity);
            System.out.println("capacity=" + capacityLeft + "; time=" + curTime);
            t += curTime;
        }

        System.out.println(t);
    }
}