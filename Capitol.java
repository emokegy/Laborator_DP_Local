import java.util.ArrayList;
import java.util.List;

public class Capitol {
	private String nume;
	private List<Subcapitol> subcapitole;
	public Capitol(String nume) {
		super();
		this.nume = nume;
		this.subcapitole = new ArrayList<Subcapitol>();
	}
	
	public int AddSubcapitol(String nume)
	{
		Subcapitol a= new Subcapitol(nume);
		subcapitole.add(a);
		return subcapitole.indexOf(a);
	}
	
	public Subcapitol GetSubcapitol(int index)
	{
		return subcapitole.get(index);
	}
	
	public void print()
	{
		System.out.println(this.nume);
		for(Subcapitol x : this.subcapitole)
		{
			x.print();
		}
	}
	
}
