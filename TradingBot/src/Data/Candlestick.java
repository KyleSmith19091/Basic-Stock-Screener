package Data;

public class Candlestick {

    private String sTimestamp;
    private double dOpen;
    private double dClose;
    private double dHigh;
    private double dLow;
    private double dVolume;

    public Candlestick(String sTimestamp, double dOpen, double dClose, double dHigh, double dLow, double dVolume) {
        this.sTimestamp = sTimestamp;
        this.dOpen = dOpen;
        this.dClose = dClose;
        this.dHigh = dHigh;
        this.dLow = dLow;
        this.dVolume = dVolume;
    }

    public String getsTimestamp() {
        return sTimestamp;
    }

    public void setsTimestamp(String sTimestamp) {
        this.sTimestamp = sTimestamp;
    }

    public double getdOpen() {
        return dOpen;
    }

    public void setdOpen(double dOpen) {
        this.dOpen = dOpen;
    }

    public double getdClose() {
        return dClose;
    }

    public void setdClose(double dClose) {
        this.dClose = dClose;
    }

    public double getdHigh() {
        return dHigh;
    }

    public void setdHigh(double dHigh) {
        this.dHigh = dHigh;
    }

    public double getdLow() {
        return dLow;
    }

    public void setdLow(double dLow) {
        this.dLow = dLow;
    }

    public double getdVolume() {
        return dVolume;
    }

    public void setdVolume(double dVolume) {
        this.dVolume = dVolume;
    }

    @Override
    public String toString() {
        return "[] " + sTimestamp + ": "
                + "\nOPEN: " + dOpen + " - " + "CLOSE: " + dClose
                + "\nHIGH: " + dHigh + " - " + "LOW: " + dLow
                + "\nVOLUME: " + dVolume;
    }
}
