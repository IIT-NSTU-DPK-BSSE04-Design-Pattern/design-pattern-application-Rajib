package Alpha;
class Transaction {
    private String merchant;
    private double amount;
    private String location;
    public Transaction(String merchant, double amount, String location) {
        this.merchant = merchant;
        this.amount = amount;
        this.location = location;
    }
    public String getMerchant() {
        return merchant;
    }
    public double getAmount() {
        return amount;
    }
    public String getLocation() {
        return location;
    }
}