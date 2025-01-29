package ObserverPatterns;

public interface IObservable {

    void add(IObserver iObserver);

    void remove(IObserver iObserver);

    void notifyObservers();

}
