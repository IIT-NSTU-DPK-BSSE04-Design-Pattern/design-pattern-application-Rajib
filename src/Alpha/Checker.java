package Alpha;

public abstract class Checker {
    private Checker nextChecker;
    public void setNextChecker(Checker nextChecker) {
        this.nextChecker = nextChecker;
    }
    public abstract void check(Transaction transaction);
}

