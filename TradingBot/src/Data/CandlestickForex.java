package Data;

public class CandlestickForex {

    private String sTimestamp;
    private double bidPrice;
    private double askPrice;

    public CandlestickForex(String sTimestamp, double bidPrice, double askPrice) {
        this.sTimestamp = sTimestamp;
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
    }

    public String getsTimestamp() {
        return sTimestamp;
    }

    public void setsTimestamp(String sTimestamp) {
        this.sTimestamp = sTimestamp;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    @Override
    public String toString() {
        return "[] TIMESTAMP: " + sTimestamp
                + "\nBID PRICE: " + bidPrice
                + "\nASK PRICE: " + askPrice;
    }
}
