package Market;

import LibraryMyLearning.String;

import java.util.*;

public class MainMarket {
    public static void main(String[] args) {
        System.out.println(" === Stock Market ===");

        StockMarket stockMarket = new StockMarket();

        Map<Date, Set<Stock>> stocksMap = new HashMap<>();

        Stock stock1 = new Stock("TES",55.20, 69);
        Stock stock2 = new Stock("PKO",303.50, 90);
        Stock stock3 = new Stock("ING",4059.60, 990);
        Stock stock4 = new Stock("BMW",4459.60, 590);
        Stock stock5 = new Stock("BTC",1259.50, 1220);
        Stock stock6 = new Stock("MIC",40779.70, 2340);
        Stock stock7 = new Stock("WIG",409.67, 120);
        Stock stock8 = new Stock("DAX",4234.62, 9190);
        Stock stock9 = new Stock("ETF",8959.60, 2390);
        Stock stock10 = new Stock("XRP",329.40, 4490);
        Stock stock11 = new Stock("COI",39.70, 6570);
        Stock stock12 = new Stock("FRD",34649.90, 990);
        Stock stock13 = new Stock("EWS",0.20, 1290);
        Stock stock14 = new Stock("VFR",549.10, 190);
        Stock stock15 = new Stock("MRD",9.40, 390);


        Date date1 = new Date(2023,1,1);
        Date date2 = new Date(2023,1,2);
        Date date3 = new Date(2023,1,3);

        stockMarket.addStockToDay(stock1, date1);
        System.out.println(stockMarket);


    }
}
