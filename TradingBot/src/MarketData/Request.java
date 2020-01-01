package MarketData;

interface Request{

    String buildStandardIntradayRequest(boolean isCompact, String vSymbol, String vInterval, String vFunction);

    String buildStandardDailyRequest(boolean isCompact, String vSymbol, String vFunction);

    String buildStandardWeeklyRequest(boolean isCompact, String vSymbol, String vFunction);

    String buildStandardMonthlyRequest(boolean isCompact, String vSymbol, String vFunction);

    String buildStandardEndpointRequest(String vSymbol, String vFunction);

    String buildStandardSearchEndpointRequest(String vSymbol, String vFunction);

}
