

import java.util.ArrayList;
import java.util.List;

public class Memento {

	private ArrayList<Element> state;
	
	public Memento() {
		this.state = new ArrayList<Element>();
	}
	
	public void setState(List<Element> elemente) {
		
		for (Element e: elemente) {
			state.add(e.copy());
		}
	}
	
	public ArrayList<Element> getState() {
		return this.state;
	}
}
