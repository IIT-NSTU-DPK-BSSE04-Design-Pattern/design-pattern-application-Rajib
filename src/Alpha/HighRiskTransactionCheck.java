package Alpha;
class HighRiskTransactionCheck extends Checker {
    @Override
    public void check(Transaction transaction) {
        System.out.println("Performing High-Risk Transaction Check...");
        // Example high-risk check: amount should not exceed a certain threshold
        if (transaction.getAmount() > 10000) {
            System.out.println("Transaction flagged: High-risk transaction.");
        } else {
            System.out.println("Transaction accepted.");
        }
    }
}
