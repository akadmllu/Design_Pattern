public class GrabStocks{
    public static void main(String[] args) {
        StockGrabber objStockGrabber = new StockGrabber();

        StockObserver objStockObserver = new StockObserver(objStockGrabber);

        objStockGrabber.setIMBPrice(197.00);
        
        objStockGrabber.setAAPLPrice(677.60);

        objStockGrabber.setGOOGPrice(676.40);

        StockObserver objStockObserver2 = new StockObserver(objStockGrabber);

        objStockGrabber.setIMBPrice(127.00);
        
        objStockGrabber.setAAPLPrice(657.60);

        objStockGrabber.setGOOGPrice(686.40);
    }
}