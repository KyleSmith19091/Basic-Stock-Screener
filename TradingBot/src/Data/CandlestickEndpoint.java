package Data;

public class CandlestickEndpoint extends Candlestick {

    private double previousClose;
    private double change;
    private double percentChange;

    public CandlestickEndpoint(String sTimestamp, double dOpen, double dClose, double dHigh, double dLow, double dVolume, double previousClose, double change, double percentChange) {
        super(sTimestamp, dOpen, dClose, dHigh, dLow, dVolume);
        this.previousClose = previousClose;
        this.change = change;
        this.percentChange = percentChange;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    @Override
    public String toString() {
        return "[] LATEST: " + getsTimestamp() + ": "
                + "\nOPEN: " + getdOpen() + " - " + "CLOSE: " + getdClose()
                + "\nHIGH: " + getdHigh() + " - " + "LOW: " + getdLow()
                + "\nVOLUME: " + getdVolume()
                + "\nPREVIOUS CLOSE: " + previousClose
                + "\nCHANGE: " + change
                + "\nCHANGE PERCENT: " + percentChange;

    }
}
