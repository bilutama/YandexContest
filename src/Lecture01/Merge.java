package Lecture01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Merge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int size1 = Integer.parseInt(tokenizer.nextToken());

        int[] a1 = new int[size1];
        tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < size1; i++) {
            a1[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(br.readLine());
        int size2 = Integer.parseInt(tokenizer.nextToken());

        int[] a2 = new int[size1];
        tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < size2; i++) {
            a2[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int[] mergedArray = new int[size1 + size2];

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] merged = new int[a1.length + a2.length];



        return merged;
    }
}
