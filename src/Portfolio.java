public class Portfolio {
    private String clientFirstName;
    private String clientLastName;
    private int portfolioNumber;
    private double portfolioValue;

    public Portfolio() {
    }

    public Portfolio(String clientFirstName, String clientLastName, int portfolioNumber, double portfolioValue) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.portfolioNumber = portfolioNumber;
        this.portfolioValue = portfolioValue;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public int getPortfolioNumber() {
        return portfolioNumber;
    }

    public void setPortfolioNumber(int portfolioNumber) {
        this.portfolioNumber = portfolioNumber;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "clientFirstName='" + clientFirstName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", portfolioNumber=" + portfolioNumber +
                ", portfolioValue=" + portfolioValue +
                '}';
    }
}
