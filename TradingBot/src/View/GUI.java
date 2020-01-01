package View;

import Controller.JSONDataParser;
import Data.Candlestick;
import MarketData.StockRequest;
import Service.StockFunctions;

public class GUI {

    public static void main(String[] args) {
        StockRequest r = new StockRequest();

        Candlestick[] c = JSONDataParser.parseJSONToCandlestickArray(r.buildStandardIntradayRequest(false, "AAPL", "1min" ,StockFunctions.INTRADAY.getFunction()));
        System.out.println("** Intraday Request Done");

        JSONDataParser.parseJSONToCandlestickArray(r.buildStandardDailyRequest(true, "AAPL", StockFunctions.DAILY.getFunction()));
        System.out.println("** Daily Request Done");

        JSONDataParser.parseJSONToCandlestickArrayAdjustedDaily(r.buildStandardDailyRequest(false, "AAPL", StockFunctions.DAILY_ADJUSTED.getFunction()));
        System.out.println("** Daily Adjusted Request Done");

        JSONDataParser.parseJSONToCandlestickArray(r.buildStandardWeeklyRequest(false, "AAPL", StockFunctions.WEEKLY.getFunction()));
        System.out.println("** Weekly Request Done");

        JSONDataParser.parseJSONCandlestickArrayAdjusted(r.buildStandardWeeklyRequest(false, "AAPL", StockFunctions.WEEKLY_ADJUSTED.getFunction()));
        System.out.println("** Weekly Adjusted Request Done");

        JSONDataParser.parseJSONToCandlestickArray(r.buildStandardMonthlyRequest(false, "AAPL", StockFunctions.MONTHLY.getFunction()));
        System.out.println("** Monthly Request Done");

        JSONDataParser.parseJSONCandlestickArrayAdjusted(r.buildStandardMonthlyRequest(false, "AAPL", StockFunctions.MONTHLY_ADJUSTED.getFunction()));
        System.out.println("** Monthly Adjusted Request Done");

        JSONDataParser.parseJSONCandlestickEndpoint(r.buildStandardEndpointRequest("AAPL", StockFunctions.QUOTE_ENDPOINT.getFunction()));
        System.out.println("** Quote endpoint request Done");

        JSONDataParser.parseJSONCandlestickEndpoint(r.buildStandardSearchEndpointRequest("AAPL", StockFunctions.SEARCH_ENDPOINT.getFunction()));
        System.out.println("** Search endpoint request Done");


    }

}
