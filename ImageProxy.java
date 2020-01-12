import java.util.List;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element,Observable {
	private String nume;
	private String oldValue;
	private Imagine realImage;
	private List<Observerr> obs;

	public ImageProxy(String nume) {
		super();
		this.nume =nume;
		
		
	}	
	public void print()
	{  
  
	if(realImage==null )	
	  realImage=new Imagine(this.nume);
		realImage.print();
	
	}
	
public void accept(Visitor a) {
		a.visit(this);
	}

	@Override
  public void add(Element element) {
    System.out.println("ERORR - IMG PROXY");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR - IMG PROXY");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR - IMG PROXY");
    return null;
  }
@Override
public void addObserver(Observerr obs) {
	this.obs.add( obs);
	
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
