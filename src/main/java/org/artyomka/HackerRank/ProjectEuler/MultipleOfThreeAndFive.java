package org.artyomka.HackerRank.ProjectEuler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class MultipleOfThreeAndFive {
    private static final Logger logger = LoggerFactory.getLogger(MultipleOfThreeAndFive.class);
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Input
        int T = Integer.parseInt(bufferedReader.readLine().trim());

        // Number of Tests Iteration
        IntStream.range(0, T).forEach(tItr -> {
            try {
                // Number Input
                int N = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(multipleOf3and5(N));
            } catch (IOException ex) {
                logger.info("IO Exception: " + ex);
            }
        });

        // Closing BufferedReader
        bufferedReader.close();
    }

    private static Integer multipleOf3and5(int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
