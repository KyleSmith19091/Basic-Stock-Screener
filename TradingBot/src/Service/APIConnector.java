package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class APIConnector {

    private static final String BASE_URL = "https://www.alphavantage.co/";

    public static String buildRequest(String inRequestParameters) {

        try {
            URL url = new URL(BASE_URL + inRequestParameters);
            System.out.println("> Connecting to AlphaVantage API");
            URLConnection connection = url.openConnection();
            System.out.println("> Connected to AlphaVantage API");

            InputStreamReader inputStream = new InputStreamReader(connection.getInputStream(), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            StringBuilder responseBuilder = new StringBuilder();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                responseBuilder.append(line + "\n");
            }
            bufferedReader.close();
            return responseBuilder.toString();
        }catch (IOException e){
            System.out.println("! Error while making request: " + e);
        }

        return null;
    }
}
