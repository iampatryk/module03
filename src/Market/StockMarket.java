package Market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StockMarket {

    private Map<Date, Set<Stock>> stocksMap = new HashMap<>();

    public double getMarketCapOfStockForDay(String ticker, Date date) {
        //bierzemy MarketCapOfStock dla danego dnia czyli:
        // potrzebuje get date i ticker i return value dla daty
        Set<Stock> stockForDay = stocksMap.get(date);
        for(Stock stock : stockForDay) {
           if(stock.ticker.equals(ticker)) {
               return stock.value;
           }
        }
        return 0;
    }

    public void getAmountOfStockInCirculation(String ticker, Date date) {

    }

    public void getTotalMarketCap(Date date) {

    }

    public void addStock(Stock stock) {
        stocksMap.put(stock, new ArrayList<>());
    }

//    public void addMarketCapOnDay(Stock stock, Date date) {
//      if(stocksMap.containsKey(stock)) {
//          stocksMap.get(stock).add(date);
//      }
//    }

}


/*








 */