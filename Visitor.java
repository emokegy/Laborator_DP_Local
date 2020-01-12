public interface Visitor {
	
	public void visit(Imagine image);
	public void visit(ImageProxy imageProxy);
	public void visit(Paragraf paragraf);
	public void visit(Tabel tabel);
	public void visit(Section section);
	public void visit(Carte carte);
}
