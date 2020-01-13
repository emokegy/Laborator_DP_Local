import java.util.Observer;

public interface Observable {
  public void addObserver(Observerr obs);
  public void removeObserver(Observerr obs);
  public void notifyObservers();
  void add(Element element);
  void remove(Element element);
  Element getElement(int index);
void setNewValue(String newValue);
void print();
}
