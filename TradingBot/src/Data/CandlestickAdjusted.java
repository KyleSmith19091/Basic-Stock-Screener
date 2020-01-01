package Data;

public class CandlestickAdjusted extends Candlestick {

    private double dividendAmount;
    private double adjustedClose;

    public CandlestickAdjusted(String sTimestamp, double dOpen, double dClose, double dHigh, double dLow, double dVolume, double dividendAmount, double adjustedClose) {
        super(sTimestamp, dOpen, dClose, dHigh, dLow, dVolume);
        this.dividendAmount = dividendAmount;
        this.adjustedClose = adjustedClose;
    }

    public double getDividendAmount() {
        return dividendAmount;
    }

    public void setDividendAmount(double dividendAmount) {
        this.dividendAmount = dividendAmount;
    }

    public double getAdjustedClose() {
        return adjustedClose;
    }

    public void setAdjustedClose(double adjustedClose) {
        this.adjustedClose = adjustedClose;
    }

    @Override
    public String toString() {
        return "[] " + getsTimestamp() + ": "
                + "\nOPEN: " + getdOpen() + " - " + "CLOSE: " + getdClose()
                + "\nHIGH: " + getdHigh() + " - " + "LOW: " + getdLow()
                + "\nADJUSTED CLOSE: " + adjustedClose
                + "\nVOLUME: " + getdVolume()
                + "\nDIVIDEND AMOUNT: " + getDividendAmount();
    }
}
