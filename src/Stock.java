import javax.sound.sampled.Port;

public class Stock {
    private String name;
    private double price;
    private int numOfShares;

    public Stock() {
    }

    public Stock(String name, double price, int numOfShares) {
        this.name = name;
        this.price = price;
        this.numOfShares = numOfShares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numOfShares=" + numOfShares +
                '}';
    }
}

