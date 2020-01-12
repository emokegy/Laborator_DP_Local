import java.util.List;
import java.util.Observer;

public class Tabel implements Element,Observable{
	private String nume;
	String oldValue;
	private List<Observerr> obs;


	public Tabel(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void print()
	{
		System.out.println("Tabel: " + this.nume);
	}
	
	public void accept(Visitor a) {
		a.visit(this);  
	

		
	}

	public void add(Element x) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element x) {
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
	// TODO Auto-generated method stub
	
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
    Observer obs =null;;

	this.notifyObservers();
	
}
}
