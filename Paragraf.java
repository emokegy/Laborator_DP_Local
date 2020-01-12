import java.util.ArrayList;
import java.util.List;
import java.util.Observer;



public class Paragraf implements Element,Observable{

	private String text;
	private  AlignStrategy aliniere;
	private List<Observerr> obs=new ArrayList<Observerr>();
	String OldValue;

	public Paragraf(String text) {
		super();
		this.text = text;
	}
	

	
	public void setAlignStrategy(AlignStrategy alig)
	{
		aliniere=alig;
		
	}

	
	public void print()
	{   
		
		if(aliniere!=null)
			aliniere.print(this.text);
		else
			System.out.println("Paragraf: " + this.text);
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
		o.update(OldValue,text);
	}
	
	
	
}






@Override
public void setNewValue(String newValue) {
	OldValue=this.text;
    text=newValue;
    notifyObservers();
	
}








}
