package Data;

public class CandlestickAdjustedDaily extends CandlestickAdjusted {

    private double splitCoefficient;

    public CandlestickAdjustedDaily(String sTimestamp, double dOpen, double dClose, double dHigh, double dLow, double dVolume, double dividendAmount, double splitCoefficient, double adjustedClose) {
        super(sTimestamp, dOpen, dClose, dHigh, dLow, dVolume, dividendAmount, adjustedClose);
        this.splitCoefficient = splitCoefficient;
    }

    public double getSplitCoefficient() {
        return splitCoefficient;
    }

    public void setSplitCoefficient(double splitCoefficient) {
        this.splitCoefficient = splitCoefficient;
    }

    @Override
    public String toString() {
        return "[] " + getsTimestamp() + ": "
                + "\nOPEN: " + getdOpen() + " - " + "CLOSE: " + getdClose()
                + "\nHIGH: " + getdHigh() + " - " + "LOW: " + getdLow()
                + "\nVOLUME: " + getdVolume()
                + "\nADJUSTED CLOSE: " + getAdjustedClose()
                + "\nDIVIDEND AMOUNT: " + getDividendAmount()
                + "\nSPLIT COEFFICIENT: " + splitCoefficient;
    }
}
