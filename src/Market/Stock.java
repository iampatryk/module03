package Market;

public class Stock {
    String ticker;
    double value;
    int amountInCirculation;

    public Stock(String ticker, double value, int amountInCirculation) {
        this.ticker = ticker;
        this.value = value;
        this.amountInCirculation = amountInCirculation;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getAmountInCirculation() {
        return amountInCirculation;
    }

    public void setAmountInCirculation(int amountInCirculation) {
        this.amountInCirculation = amountInCirculation;
    }

    @Override
    public String toString() {
        return "Stock " +
                "ticker: '" + ticker + '\'' +
                " || value: " + value + "zl" +
                " || amountInCirculation: " + amountInCirculation + "mld";
    }
}
