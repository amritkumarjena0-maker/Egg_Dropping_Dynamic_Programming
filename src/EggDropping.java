
import java.util.Scanner;

public class EggDropping {

    public static int eggDrop(int eggs, int floors) {

        int[][] dp = new int[eggs + 1][floors + 1];

        // Base cases
        for (int i = 1; i <= eggs; i++) {
            dp[i][0] = 0;
            if (floors >= 1) {
                dp[i][1] = 1;
            }
        }

        for (int j = 1; j <= floors; j++) {
            dp[1][j] = j;
        }

        // Dynamic Programming
        for (int e = 2; e <= eggs; e++) {

            for (int f = 2; f <= floors; f++) {

                dp[e][f] = Integer.MAX_VALUE;

                for (int x = 1; x <= f; x++) {

                    int breakCase = dp[e - 1][x - 1];
                    int surviveCase = dp[e][f - x];

                    int attempts = 1 +
                            Math.max(breakCase, surviveCase);

                    dp[e][f] = Math.min(
                            dp[e][f], attempts
                    );
                }
            }
        }

        return dp[eggs][floors];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EGG DROPPING PROBLEM =====");

        System.out.print("Enter number of eggs: ");
        int eggs = sc.nextInt();

        System.out.print("Enter number of floors: ");
        int floors = sc.nextInt();

        if (eggs <= 0 || floors < 0) {
            System.out.println("Invalid input!");
        } else {
            int result = eggDrop(eggs, floors);

            System.out.println(
                "Minimum number of attempts: " + result
            );
        }

        sc.close();
    }
}
