

import java.util.ArrayList;
import java.util.List;

public class DeleteCommand implements Command{
	
	private Memento memento;

	@Override
	public void execute() {
		
		
		DocumentManager manager = DocumentManager.getInstance();
		this.memento = new Memento();
		
		List<Element> elemente = DocumentManager.getSection().getContent();
		
		memento.setState(elemente);
		
		elemente.remove(elemente.size() - 1);
		manager.getSection().SetContent(elemente);
	}
	
	public void unexecute() {
		
		DocumentManager manager = DocumentManager.getInstance();
		
		//ArrayList<Element> elemente = memento.getState();
		
		//DocumentManager.getBook().SetContent(elemente);
	}
}
