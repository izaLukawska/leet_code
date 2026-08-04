package pl.lukawska.leetcode.medium;

public class LC_299 {
    public String getHint(String secret, String guess) {
        int bullsCount = 0;
        int cowsCount = 0;

        int[] secretDigitFreq = new int[10];
        int[] guessDigitFreq = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int secretDigit = secret.charAt(i) - '0';
            int guessDigit = guess.charAt(i) - '0';

            if (secretDigit == guessDigit) {
                bullsCount++;
            } else {
                secretDigitFreq[secretDigit]++;
                guessDigitFreq[guessDigit]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            cowsCount += Math.min(secretDigitFreq[i], guessDigitFreq[i]);
        }

        return bullsCount + "A" + cowsCount + "B";
    }
}
