package Alpha;

class BasicChecks extends Checker {
    @Override
    public void check(Transaction transaction) {
        System.out.println("Performing Basic Checks...");
        // Example basic checks: amount should not be negative
        if (transaction.getAmount() < 0) {
            System.out.println("Transaction rejected: Negative amount.");
        } else if (nextChecker != null) {
            nextChecker.check(transaction);
        }
    }
}

