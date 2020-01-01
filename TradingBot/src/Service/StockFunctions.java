package Service;

public enum StockFunctions {
    INTRADAY ("TIME_SERIES_INTRADAY"),
    DAILY ("TIME_SERIES_DAILY"),
    DAILY_ADJUSTED ("TIME_SERIES_DAILY_ADJUSTED"),
    WEEKLY ("TIME_SERIES_WEEKLY"),
    WEEKLY_ADJUSTED ("TIME_SERIES_WEEKLY_ADJUSTED"),
    MONTHLY ("TIME_SERIES_MONTHLY"),
    MONTHLY_ADJUSTED ("TIME_SERIES_MONTHLY_ADJUSTED"),
    QUOTE_ENDPOINT ("GLOBAL_QUOTE"),
    SEARCH_ENDPOINT ("SYMBOL_SEARCH");

    private String function;

    StockFunctions(String inFunction){
        this.function = inFunction;
    }

    public String getFunction(){
        return this.function;
    }

}
