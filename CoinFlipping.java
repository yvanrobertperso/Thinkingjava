import java.util.Random;

public class CoinFlipping {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();

        // Simulate coin flipping 10 times
        for (int i = 0; i < 10; i++) {
            // Generate a random number between 0 and 1
            int randomNumber = random.nextInt(2);

            // If the random number is 0, it's heads. Otherwise, it's tails.
            String result = (randomNumber == 0) ? "Heads" : "Tails";

            // Print the result
            System.out.println("Coin flip " + (i + 1) + ": " + result);
        }
    }
}
