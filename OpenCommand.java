import dp_lab2.DocumentManager;

public class OpenCommand implements Command{
	public String st;
	public OpenCommand(String st) {
	this.st=st;
	}

	public void execute() {
	    JSONBuilder jsonBuilder = new JSONBuilder("book.json");
	    jsonBuilder.Build();
	    Carte book = new Carte("carte1");
	    book.addContent(jsonBuilder.GetResult());
	    DocumentManager.getInstance().setBook(book);
	    book.print();
	  }

}