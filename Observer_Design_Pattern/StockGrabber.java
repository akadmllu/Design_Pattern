import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> lstObserver;
    private double imbPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        lstObserver = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer objObserver) {
        lstObserver.add(objObserver);
    }

    @Override
    public void unregister(Observer objObserver) {
        int jObserverIndex = lstObserver.indexOf(objObserver);
        System.out.println("Observer " + (jObserverIndex + 1) + " deleted");
        lstObserver.remove(jObserverIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer objObserver : lstObserver){
            objObserver.update(imbPrice, aaplPrice, googPrice);
        }
    }
    
    public void setIMBPrice(double newIBMPrice){
        this.imbPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }
    
    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}