package Controller;

import Data.Candlestick;
import Data.CandlestickAdjusted;
import Data.CandlestickAdjustedDaily;
import Data.CandlestickEndpoint;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONDataParser {

    public static Candlestick[] parseJSONToCandlestickArray(String jsonData){

        try {
            JSONObject apiResponseData = new JSONObject(jsonData); // Convert String response to JSONObject

            JSONArray responseDataNames = apiResponseData.names();

            JSONObject metaData = (JSONObject) apiResponseData.get("Meta Data"); // Get meta data from response

            System.out.println("> META DATA --> " + metaData.toString());

            JSONObject responseData = (JSONObject) apiResponseData.get(responseDataNames.get(0).toString()); // Get requested data

            JSONArray arr = responseData.names(); // Get the names of all of the JSONObject

            Candlestick[] candlesticks = new Candlestick[arr.length()];

            for (int i = 0; i < arr.length(); i++) {
                JSONObject dataItem = (JSONObject) responseData.get((String)arr.get(i));
                candlesticks[i] = new Candlestick(
                        (String) arr.get(0),
                        dataItem.getDouble("1. open"),
                        dataItem.getDouble("4. close"),
                        dataItem.getDouble("2. high"),
                        dataItem.getDouble("3. low"),
                        dataItem.getDouble("5. volume")
                );
            } // End of for loop
            return candlesticks;
        }catch (JSONException e){
            System.out.println(e);
        }

        return null;
    }

    public static Candlestick[] parseJSONToCandlestickArrayAdjustedDaily(String jsonData){

        try {
            JSONObject apiResponseData = new JSONObject(jsonData);

            JSONArray responseDataNames = apiResponseData.names();

            JSONObject metaData = (JSONObject) apiResponseData.get("Meta Data");

            System.out.println("> META DATA --> " + metaData.toString());

            JSONObject responseData = (JSONObject) apiResponseData.get(responseDataNames.get(0).toString());

            JSONArray arr = responseData.names();

            CandlestickAdjustedDaily[] candlesticks = new CandlestickAdjustedDaily[arr.length()];

            for (int i = 0; i < arr.length(); i++) {
                JSONObject dataItem = (JSONObject) responseData.get((String) arr.get(i));
                candlesticks[i] = new CandlestickAdjustedDaily(
                        (String) arr.get(0),
                        dataItem.getDouble("1. open"),
                        dataItem.getDouble("4. close"),
                        dataItem.getDouble("2. high"),
                        dataItem.getDouble("3. low"),
                        dataItem.getDouble("6. volume"),
                        dataItem.getDouble("7. dividend amount"),
                        dataItem.getDouble("8. split coefficient"),
                        dataItem.getDouble("5. adjusted close")
                );
            }
            return candlesticks;
        }catch (JSONException e){
            System.out.println(e);
        }
        return null;
    }

    public static Candlestick[] parseJSONCandlestickArrayAdjusted(String jsonData){

        try {
            JSONObject apiResponseData = new JSONObject(jsonData);

            JSONArray responseDataNames = apiResponseData.names();

            JSONObject metaData = (JSONObject) apiResponseData.get("Meta Data");

            System.out.println("> META DATA --> " + metaData.toString());

            JSONObject responseData = (JSONObject) apiResponseData.get(responseDataNames.get(0).toString());

            JSONArray arr = responseData.names();

            CandlestickAdjusted[] candlesticks = new CandlestickAdjusted[arr.length()];

            for (int i = 0; i < arr.length(); i++) {
                JSONObject dataItem = (JSONObject) responseData.get((String) arr.get(i));
                candlesticks[i] = new CandlestickAdjusted(
                        (String) arr.get(0),
                        dataItem.getDouble("1. open"),
                        dataItem.getDouble("4. close"),
                        dataItem.getDouble("2. high"),
                        dataItem.getDouble("3. low"),
                        dataItem.getDouble("6. volume"),
                        dataItem.getDouble("7. dividend amount"),
                        dataItem.getDouble("5. adjusted close")
                );
            }
            return candlesticks;
        }catch (JSONException e){
            System.out.println(e);
        }
        return null;


    }

    public static Candlestick parseJSONCandlestickEndpoint(String jsonData){

        try {
            JSONObject apiResponseData = new JSONObject(jsonData);

            JSONObject endpointData = (JSONObject) apiResponseData.get("Global Quote");

            //TODO: Remove this
            System.out.println(endpointData.toString());

            return new CandlestickEndpoint(
                    endpointData.getString("07. latest trading day"),
                    endpointData.getDouble("02. open"),
                    endpointData.getDouble("08. previous close"),
                    endpointData.getDouble("03. high"),
                    endpointData.getDouble("04. low"),
                    endpointData.getDouble("06. volume"),
                    endpointData.getDouble("08. previous close"),
                    endpointData.getDouble("09. change"),
                    endpointData.getDouble("10. change percent")
            );
        }catch (JSONException e){
            System.out.println(e);
        }

        return null;
    }

}
