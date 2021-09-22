import java.util.Scanner;

public class TestPortfolio extends Portfolio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Portfolio
        System.out.print("Enter first name");
        String firstName = input.nextLine();
        System.out.print("Enter last name");
        String lastName = input.nextLine();
        System.out.print("Enter portfolio number");
        int num = input.nextInt();
        System.out.print("Enter total value of portfolio");
        double value = input.nextDouble();

        Portfolio portfolio = new Portfolio(firstName, lastName, num, value);

        input.nextLine();

        //Savings
        System.out.print("Enter account number");
        String savingsAccount = input.nextLine();
        System.out.print("Enter account balance");
        double balance = input.nextDouble();

        SavingsAccount account1 = new SavingsAccount(savingsAccount,balance);

        input.nextLine();
        //Bonds
        System.out.print("Enter bond name");
        String bondName = input.nextLine();
        System.out.print("Enter bond value");
        double bondValue = input.nextDouble();
        System.out.print("Enter number of bonds");
        int numBonds = input.nextInt();

        Bonds bond1 = new Bonds(bondName, bondValue, numBonds);

        input.nextLine();

        //Stocks
        System.out.print("Enter stock name");
        String stockName = input.nextLine();
        System.out.print("Enter stock value");
        double stockValue = input.nextDouble();
        System.out.print("Enter number of shares");
        int stockShares = input.nextInt();

        Stock stock1 = new Stock(stockName, stockValue, stockShares);

        input.nextLine();

        double portfolioValue = portfolio.getPortfolioValue() + account1.getAccountBalance();
        portfolioValue += bond1.getNumBonds() * bond1.getFaceValue();
        portfolioValue += stock1.getNumOfShares() * stock1.getPrice();

        portfolio.setPortfolioValue(portfolioValue);
        portfolio.toString();
        account1.toString();
        bond1.toString();
        stock1.toString();

    }
}
