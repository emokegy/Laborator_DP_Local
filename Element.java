public interface Element {
	

	
	public void print();
	public void accept(Visitor a);

	public void add(Element element);

  public void remove(Element element);

  public Element getElement(int index);
  public void setNewValue(String newValue);
  
}
