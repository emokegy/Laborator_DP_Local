import java.util.Observer;

public interface Observable {
  public void addObserver(Observerr obs);
  public void removeObserver(Observerr obs);
  public void notifyObservers();
}
