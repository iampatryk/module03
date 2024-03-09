package Market;

import java.util.*;

public class StockMarket {

    private Map<Date, Set<Stock>> stocksMap = new HashMap<>();

    public double getMarketCapOfStockForDay(String ticker, Date date) {

        return 0;
    }

    public void getAmountOfStockInCirculation(String ticker, Date date) {

    }

    public void getTotalMarketCap(Date date) {

    }

    public void addStockToDay(Stock stock, Date date) {
        // Sprawdź, czy mapa zawiera już klucz odpowiadający danej dacie
        if(stocksMap.containsKey(date)) {
            // Jeśli tak, pobierz zestaw akcji dla tej daty i dodaj nową akcję do tego zestawu
            stocksMap.get(date).add(stock);
        }

    }
}


/*








 */