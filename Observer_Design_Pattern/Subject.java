public interface Subject{
    public void register(Observer objObserver);
    public void unregister(Observer objObserver);
    public void notifyObserver();
}