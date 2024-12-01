package Alpha;

public class FraudDetectionSystem {
    public static void main(String[] args) {
        Checker basicChecks = new BasicChecks();
        Checker geographyAnomalyCheck = new GeographyAnomalyCheck();
        Checker blacklistedCustomerCheck = new BlacklistedCustomerCheck();
        Checker highRiskTransactionCheck = new HighRiskTransactionCheck();

        basicChecks.setNextChecker(geographyAnomalyCheck);
        geographyAnomalyCheck.setNextChecker(blacklistedCustomerCheck);
        blacklistedCustomerCheck.setNextChecker(highRiskTransactionCheck);
        Transaction transaction = new Transaction("MerchantC", 15000, "HighRisk");
        basicChecks.check(transaction);
    }
}
