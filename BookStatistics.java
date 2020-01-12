public class BookStatistics implements Visitor{

	private int ip=0;
	private int p=0;
	private int i=0;
	private int s=0;
	private int c=0;
	private int t=0;
	public void visit(Imagine image) {
		i++;
		
	}
	public void visit(ImageProxy imageProxy) {
		ip++;
	}
	public void visit(Paragraf paragraf) {
		p++;
	}
	public void visit(Tabel tabel) {
		t++;
	}
	public void visit(Section section) {
		s++;

	}
	public void visit(Carte carte) {
		c++;
		
	}
	 public void printStatistics() {
    System.out.println("\nBookStatistics--\nnumber ~BOOKS~ : " +c);
    System.out.println("number ~IMAGE~ : " + i);
    System.out.println("number ~TABLE~ : " + t);
    System.out.println("number ~PARAGRAPH~ : " + p);
    System.out.println("number ~IMAGEPROXY~ : " + ip);
    System.out.println("number ~SECTIONS~ : " + s);
  }
	


}
