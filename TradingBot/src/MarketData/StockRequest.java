package MarketData;
import Controller.ParameterStringBuilder;
import Service.APIConnector;

import java.util.HashMap;
import java.util.Map;

public class StockRequest implements Request{


    /*
    * function
    * symbol
    * interval
    * optional = outputsize
    * optional = datatype - JSON : CSV file
    * */

    /*-----------------------------------------------------------------------------------*/

    @Override
    public String buildStandardIntradayRequest(boolean isCompact, String vSymbol, String vInterval, String vFunction) {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("function", vFunction);
        requestParams.put("symbol", vSymbol);
        requestParams.put("interval", vInterval);
        String outputsizeEval = isCompact ? "compact" : "full";
        requestParams.put("outputsize", outputsizeEval);
        System.out.println("> Request Parameters Set");
        return APIConnector.buildRequest(ParameterStringBuilder.getParamsString(requestParams));
    }

    @Override
    public String buildStandardDailyRequest(boolean isCompact, String vSymbol, String vFunction){
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("function", vFunction);
        requestParams.put("symbol", vSymbol);
        String outputSizeEval = isCompact ? "compact" : "full";
        requestParams.put("outputsize", outputSizeEval);
        System.out.println("> Request Parameters Set");
        return APIConnector.buildRequest(ParameterStringBuilder.getParamsString(requestParams));
    }

    /*-----------------------------------------------------------------------------------*/

    @Override
    public String buildStandardWeeklyRequest(boolean isCompact, String vSymbol, String vFunction){
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("function", vFunction);
        requestParams.put("symbol", vSymbol);
        String outputSizeEval = isCompact ? "compact" : "full";
        requestParams.put("outputsize", outputSizeEval);
        System.out.println("> Request Parameters Set");
        return APIConnector.buildRequest(ParameterStringBuilder.getParamsString(requestParams));
    }

    /*-----------------------------------------------------------------------------------*/

    @Override
    public String buildStandardMonthlyRequest(boolean isCompact, String vSymbol, String vFunction){
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("function", vFunction);
        requestParams.put("symbol", vSymbol);
        String outputSizeEval = isCompact ? "compact" : "full";
        requestParams.put("outputsize", outputSizeEval);
        System.out.println("> Request Parameters Set");
        return APIConnector.buildRequest(ParameterStringBuilder.getParamsString(requestParams));
    }

    /*-----------------------------------------------------------------------------------*/

    @Override
    public String buildStandardEndpointRequest(String vSymbol, String vFunction){
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("function", vFunction);
        requestParams.put("symbol", vSymbol);
        System.out.println("> Request Params Set");
        return APIConnector.buildRequest(ParameterStringBuilder.getParamsString(requestParams));
    }

    /*-----------------------------------------------------------------------------------*/

    @Override
    public String buildStandardSearchEndpointRequest(String vSymbol, String vFunction){
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("function", vFunction);
        requestParams.put("keywords", vSymbol);
        System.out.println("> Request Params Set");
        return APIConnector.buildRequest(ParameterStringBuilder.getParamsString(requestParams));
    }

    /*-----------------------------------------------------------------------------------*/

}// End of class
