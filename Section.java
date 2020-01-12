

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Section implements Element,Observable{
	private String title;
	private List<Element> content;
	private String oldValue;
	private List<Observerr>obs=new ArrayList<Observerr>();


	public Section(String title) {
		super();
		this.title = title;
		this.content=new ArrayList<Element>();
	}
    public List<Element> getContent(){
    	return this.content;
    	
    }
	
	public int addElm(Element elm)
	{
		content.add(elm);
		return content.indexOf(elm);
	}
	
	public void delete(Element elm)
	{
		content.remove(elm);
	}
	
	public Element getElement(int ind)
	{
		return content.get(ind);
	}
	@Override
	public void print()
	{
		System.out.println(this.title);
		for(Element x : content)
		{
			x.print();
		}
	}
	
public void accept(Visitor a) {
	a.visit(this);
	
	 for (Element x : content) {
	      x.accept(a);
	    }
		
}

@Override
public void add(Element element) {
	 content.add(element);
	
}

@Override
public void remove(Element element) {
	// TODO Auto-generated method stub
	
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
	for(Observerr o:obs)
	{
		o.update(oldValue,title);
	}
	
}

@Override
public void setNewValue(String newValue) {
	oldValue=this.title;
    title=newValue;
	this.notifyObservers();
	
}
public Element getLastElement() {
	return content.get(content.size()-1);
	
}
public Section copy()
{
	Section s=new Section(this.title);
	for(Element e:getContent())
	{
		s.add(s.copy());
	}
	return s;
 }
public void SetContent(List<Element> elemente) {
	// TODO Auto-generated method stub
   this.content=content;	
	
}
}
