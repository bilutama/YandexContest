package Wormup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        long capacity = Long.parseLong(tokenizer.nextToken());

        str = br.readLine();
        tokenizer = new StringTokenizer(str);
        int n = 1 + Integer.parseInt(tokenizer.nextToken());

        long[] a = new long[n];

        a[0] = 0L;
        for (int i = 1; i < n; i++) {
            str = br.readLine();
            tokenizer = new StringTokenizer(str);
            a[i] = Long.parseLong(tokenizer.nextToken());
        }

        if (n < 2) {
            System.out.println(0);
        }

        // Algorithm
        BigInteger t = BigInteger.valueOf(2 * ((a[n - 1] + capacity - 1) / capacity) * (n - 1));
        long capacityLeft = 0;

        if (a[n - 1] > 0) {
            capacityLeft = capacity > a[n - 1] ?
                    capacity - a[n - 1] :
                    (a[n - 1] % capacity == 0 ? 0 : capacity - a[n - 1] % capacity);
        }

        long peopleOnCurrentFloor;
        BigInteger curTime;

        for (int i = n - 2; i > 0; --i) {
            capacityLeft -= a[i];

            if (capacityLeft >= 0) {
                continue;
            }

            peopleOnCurrentFloor = -capacityLeft;
            // New capacityLeft value
            capacityLeft = capacity >= peopleOnCurrentFloor ?
                    capacity - peopleOnCurrentFloor :
                    (peopleOnCurrentFloor % capacity == 0 ? 0 : capacity - peopleOnCurrentFloor % capacity);

            curTime = BigInteger.valueOf(2 * i * ((peopleOnCurrentFloor + capacity - 1) / capacity));
            t = t.add(curTime);
        }

        System.out.println(t);
    }
}