package Lecture01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Predicate;

public class Partition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(tokenizer.nextToken());

        int[] e = new int[size];
        tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; i++) {
            e[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(br.readLine());
        int ref = Integer.parseInt(tokenizer.nextToken());

        int counter = partition(e, 0, e.length - 1, x -> x < ref);

        System.out.println(counter);
        System.out.println(size - counter);
    }

    public static int partition(int[] array, int start, int end, Predicate<Integer> predicate) {
        int counter = 0;

        for (int i : array) {
            if (predicate.test(i)) {
                ++counter;
            }
        }

        return counter;
    }
}
