package interfaces.observer;

/**
 * Created by Dell on 24.11.2016.
 */
public interface IObserver {
    void setObservable(IObservable observable);

    void update();
}
