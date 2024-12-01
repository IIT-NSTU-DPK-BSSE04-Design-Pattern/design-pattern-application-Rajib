package Alpha;

class GeographyAnomalyCheck extends Checker {
    @Override
    public void check(Transaction transaction) {
        System.out.println("Performing Geography Anomaly Check...");
        // Example geography anomaly check: location should not be "HighRisk"
        if ("HighRisk".equalsIgnoreCase(transaction.getLocation())) {
            System.out.println("Transaction escalated: High-risk location.");
            if (nextChecker != null) {
                nextChecker.check(transaction);
            }
        } else if (nextChecker != null) {
            nextChecker.check(transaction);
        }
    }
}
