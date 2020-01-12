


  



public class DocumentManager {
  private static DocumentManager instanta = null;
  private static Carte book = null;
  private static Section sec = null;

  private DocumentManager() {

  }

  public static DocumentManager getInstance() {
    if (instanta == null) {
      instanta = new DocumentManager();
    }
    return instanta;
  }

  public void setBook( Carte book) {
    DocumentManager.book = book;
  }

  public static Carte getBook() {
    return book;
  }

public void setSection(Section cap1) {
	this.sec=cap1;
	
}

public static Section getSection() {
	return sec;
	
}





}

