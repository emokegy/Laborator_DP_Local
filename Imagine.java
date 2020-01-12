import java.util.List;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class Imagine implements Element,Observable{
	String nume;
	String oldValue;
	private List<Observerr> obs;

	public Imagine(String nume) {
		super();
		this.nume = nume;
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	@Override
	public void print()
	{
		System.out.println("Imagine: " + this.nume);
	}
	
	public void accept(Visitor a) {
		a.visit(this);
			
	}
	 public void add(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }

@Override
public void addObserver(Observerr obs) {
  this.obs.add(obs);
	
}

@Override
public void removeObserver(Observerr obs) {
	this.obs.remove(obs);
	
}

@Override
public void notifyObservers() {
	
	for(Observerr o :obs)
	{
		o.update(oldValue,nume);
	}
	
}

@Override
public void setNewValue(String newValue) {
	oldValue=this.nume;
    nume=newValue;
	this.notifyObservers();
	
	
}
}
