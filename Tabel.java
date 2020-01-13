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

  
  public void remove(Element x) {
    System.out.println("ERORR");
  }

  
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }


public void addObserver(Observerr obs) {
	this.obs.add(obs);
	
}


public void removeObserver(Observerr obs) {
	// TODO Auto-generated method stub
	
}


public void notifyObservers() {
	
	for(Observerr o :obs)
	{
		o.update(oldValue,nume);
	}
	
}


public void setNewValue(String newValue) {
	oldValue=this.nume;
    nume=newValue;
    Observer obs =null;;

	this.notifyObservers();
	
}

public Section copy() {
	// TODO Auto-generated method stub
	return null;
}
}
