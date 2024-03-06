package Market;

import java.util.ArrayList;
import java.util.List;

public class MainMarket {
    public static void main(String[] args) {
        System.out.println(" === Stock Market ===");

        StockMarket stockMarket = new StockMarket();

        Stock stock1 = new Stock("TESLA",55.20, 69);
        Stock stock2 = new Stock("TESLA",303.50, 90);
        Stock stock3 = new Stock("TESLA",4059.60, 990);
        Stock stock4 = new Stock("TESLA",4459.60, 590);
        Stock stock5 = new Stock("TESLA",1259.50, 1220);
        Stock stock6 = new Stock("TESLA",40779.70, 2340);
        Stock stock7 = new Stock("TESLA",409.67, 120);
        Stock stock8 = new Stock("TESLAE",4234.62, 9190);
        Stock stock9 = new Stock("TESLA",8959.60, 2390);
        Stock stock10 = new Stock("TESLA",3449.40, 9390);


        stockMarket.addStock(stock1);
        stockMarket.addStock(stock2);
        stockMarket.addStock(stock3);
        stockMarket.addStock(stock4);
        stockMarket.addStock(stock5);
        stockMarket.addStock(stock6);
        stockMarket.addStock(stock7);
        stockMarket.addStock(stock8);
        stockMarket.addStock(stock9);
        stockMarket.addStock(stock10);

        for (Stock stock : stockMarket) {
            System.out.println(stock);
        }


        Date date1 = new Date(2023,1,12);
        Date date2 = new Date(2023,2,11);
        Date date3 = new Date(2023,3,19);
        Date date4 = new Date(2023,4,1);
        Date date5 = new Date(2023,5,2);
        Date date6 = new Date(2023,6,23);
        Date date7 = new Date(2023,7,31);
        Date date8 = new Date(2023,8,12);
        Date date9 = new Date(2023,9,1);
        Date date10 = new Date(2023,10,13);




    }
}
