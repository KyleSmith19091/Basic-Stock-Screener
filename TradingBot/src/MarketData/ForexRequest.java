package MarketData;

public class ForexRequest implements Request {

    @Override
    public String buildStandardIntradayRequest(boolean isCompact, String vSymbol, String vInterval, String vFunction) {

        return null;
    }

    @Override
    public String buildStandardDailyRequest(boolean isCompact, String vSymbol, String vFunction) {
        return null;
    }

    @Override
    public String buildStandardWeeklyRequest(boolean isCompact, String vSymbol, String vFunction) {
        return null;
    }

    @Override
    public String buildStandardMonthlyRequest(boolean isCompact, String vSymbol, String vFunction) {
        return null;
    }

    @Override
    public String buildStandardEndpointRequest(String vSymbol, String vFunction) {

        return null;
    }

    @Override
    public String buildStandardSearchEndpointRequest(String vSymbol, String vFunction) {
        return null;
    }
}
