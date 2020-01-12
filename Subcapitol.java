import java.util.ArrayList;
import java.util.List;

public class Subcapitol {
	private String nume;
	private List<Paragraf> paragrafe;
	private List<Imagine> imagini;
	private List<Tabel> tabele;
	
	public Subcapitol(String nume) {
		super();
		this.nume = nume;
		this.paragrafe = new ArrayList<Paragraf>();
		this.imagini = new ArrayList<Imagine>();
		this.tabele = new ArrayList<Tabel>();
	}
	
	public int AddImagine(String nume)
	{
		Imagine a=new Imagine(nume);
		imagini.add(a);
		return imagini.indexOf(a);
	}
	
	public void print()
	{
		
	}
	
	public int AddParagraf(String text)
	{
		Paragraf a=new Paragraf(text);
		paragrafe.add(a);
		return paragrafe.indexOf(a);
	}
	
	public int AddTabel(String nume)
	{
		Tabel a=new Tabel(nume);
		tabele.add(a);
		return tabele.indexOf(a);
	}
}
