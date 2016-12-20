package interfaces;

/**
 * Created by Dell on 24.11.2016.
 */
public interface IObservable {
    void attach(IObserver observer);
    void unpin(IObserver observer);
    void notifyAllObservers ();
}
