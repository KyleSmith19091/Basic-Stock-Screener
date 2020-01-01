package Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class ParameterStringBuilder {

    public static final String API_KEY = "4928ACQUTK235CM4";

    public static String getParamsString(Map<String, String> params){

        try {
            StringBuilder result = new StringBuilder();

            result.append("query?");

            for (Map.Entry<String, String> entry: params.entrySet()){
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            result.append("apikey=");
            result.append(API_KEY);

            String resultString = result.toString();
            return resultString.length() > 0 ? resultString.substring(0, resultString.length()-1) : resultString;

        }catch (UnsupportedEncodingException e){
            System.out.println(e);
        }

        return null;
    }

    public static String[] divideForexPair(String forexPair){return forexPair.split("/");}

}
