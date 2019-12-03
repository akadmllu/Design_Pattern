public class StockObserver implements Observer{

    private double imbPrice;
    private double aaplPrice;
    private double googPrice;

    private static int jObserverIDTracker = 0;

    private int jObserverID;

    private Subject objSubject;

    public StockObserver(Subject objSubject){
        this.objSubject = objSubject;

        this.jObserverID = ++jObserverIDTracker;

        System.out.println("New Observer " + this.jObserverID);

        objSubject.register(this);
    }

    @Override
    public void update(double imbPrice, double aaplPrice, double googPrice) {
        
        this.imbPrice = imbPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();

    }

    private void printThePrices() {

        System.out.println(jObserverID + 
            "\nIMB : " + imbPrice + 
            "\nAAPL : " + aaplPrice +
            "\nGOOG : " + googPrice + "\n" );

    }

}