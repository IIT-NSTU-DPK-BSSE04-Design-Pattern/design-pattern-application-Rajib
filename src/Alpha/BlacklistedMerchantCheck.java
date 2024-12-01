package Alpha;

class BlacklistedCustomerCheck extends Checker {
    private static final String[] BLACKLISTED = {"A", "B"};
    @Override
    public void check(Transaction transaction) {
        System.out.println("Performing Blacklisted Customer Check...");
        for (String customer : BLACKLISTED) {
            if (customer.equalsIgnoreCase(transaction.getMerchant())) {
                System.out.println("Transaction flagged: Blacklisted customer.");
                return;
            }
        }
        if (nextChecker != null) {
            nextChecker.check(transaction);
        }
    }
}
