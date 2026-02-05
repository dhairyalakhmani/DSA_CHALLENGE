package DSA_CHALLENGE.BitManipulation;

public class countSetBits {
    private static final int MOD = (int) (1e9 + 7);

    public int countBits(int A) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            int validLength = A - ((1 << i) - 1);
            if (validLength <= 0) break;
            int setBitsInOneCompleteCycle = (1 << i);
            int completeCycleLength = (1 << (i + 1));
            int completeCycles = validLength / completeCycleLength;
            int completedCycleContribution = completeCycles * setBitsInOneCompleteCycle;
            int remainingLength = validLength - (completeCycles * completeCycleLength);
            int remainingLengthContribution = Math.min(remainingLength, setBitsInOneCompleteCycle);
            int totalContribution = (completedCycleContribution + remainingLengthContribution) % MOD;
            sum = (sum + totalContribution) % MOD;
        }
        return sum;
    }
}
