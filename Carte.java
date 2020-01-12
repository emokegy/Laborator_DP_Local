

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Carte implements Element{
	private String name;
	private List<Autor> autori;
	private List<Element> cuprins;
	private List<Element> content = new ArrayList<Element>();
	
	public Carte(String name) {
		this.name=name;
		this.autori=new ArrayList<Autor>();
		this.cuprins= new ArrayList<Element>();
	}
	
	
	public void print()
	{
		System.out.println(this.name);
		for(Autor x : this.autori)
		{
			System.out.println(x.print());
		}
		for(Element x : this.cuprins)
		{
			x.print();
		}
		
	}


	public void AddAutor(Autor a)
	{
		autori.add(a);
	}
	
	public int addContent(Element elm)
	{
		cuprins.add(elm);
		return cuprins.indexOf(elm);
	}
	public List<Element> getContent()
	{
		return this.cuprins;
	}
	 public void SetContent(List<Element> elemente) {
	        this.cuprins = elemente;
	    }
	
	 public void accept(Visitor a) {
   
		 a.visit(this);
		for (Element x : content) {
		     x.accept(a);
		    }
  }
	/*public Capitol GetCapitol(int index)
	{
		return cuprins.get(index);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Autor> getAutori() {
		return autori;
	}

	public List<Capitol> getCuprins() {
		return cuprins;
	}

	public void setCuprins(List<Capitol> cuprins) {
		this.cuprins = cuprins;
	}*/
	
		public void add(Element element) {
		}

		public void remove(Element element) {
			
		}

		public Element getElement(int index) {
		
			return null;
		}
	
	public static void main(String[] args)
	{
		/*Carte noapteBuna = new Carte("Noapte buna, copii!");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		noapteBuna.AddAutor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);
		cap1.addElm(new Paragraf("Moto capitol"));
		cap1.addElm(cap11);
		cap11.addElm(new Paragraf("Text from subchapter 1.1"));
		cap11.addElm(cap111);
		cap111.addElm(new Paragraf("Text from subchapter 1.1.1"));
		cap111.addElm(cap1111);
		cap1111.addElm(new Imagine("Image subchapter 1.1.1.1"));
		noapteBuna.print();
		
		
		
		long startTime = System.currentTimeMillis();
		Imagine img1 = new Imagine("Pamela Anderson");
		Imagine img2 = new Imagine("Kim Kardashian");
		Imagine img3 = new Imagine("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.addElm(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.addElm(img2);
		playboyS2.addElm(img3);
	    Carte playboy = new Carte("Playboy");

		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");
		
		
		
			long startTime = System.currentTimeMillis();
			ImageProxy img1 = new ImageProxy("Pamela Anderson");
			ImageProxy img2 = new ImageProxy("Kim Kardashian");
			ImageProxy img3 = new ImageProxy("Kirby Griffin");
			Section playboyS1 = new Section("Front Cover");
			playboyS1.addElm(img1);
			Section playboyS2 = new Section("Summer Girls");
			playboyS2.addElm(img2);
			playboyS2.addElm(img3);
		    Carte playboy = new Carte("Playboy");
			playboy.addContent(playboyS1);
			playboy.addContent(playboyS2);
			long endTime = System.currentTimeMillis();
			System.out.println("Creation of the content took " + (endTime -
			startTime) + " milliseconds");
			startTime = System.currentTimeMillis();
			playboyS1.print();
			endTime = System.currentTimeMillis();
			System.out.println("Printing of the section 1 took " + (endTime -
			startTime) + " milliseconds");
			startTime = System.currentTimeMillis();
			playboyS1.print();
			endTime = System.currentTimeMillis();
			System.out.println("Printing again the section 1 took " + (endTime -
			startTime) + " milliseconds");
		   
		Section cap1 = new Section("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraph 1");
		cap1.addElm(p1);
		Paragraf p2 = new Paragraf("Paragraph 2");
		cap1.addElm(p2);
		Paragraf p3 = new Paragraf("Paragraph 3");
		cap1.addElm(p3);
		Paragraf p4 = new Paragraf("Paragraph 4");
		cap1.addElm(p4);
		System.out.println("Printing without Alignment");

		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
			
		
		
		
			Section cap1 = new Section("Capitolul 1");
			Paragraf p1 = new Paragraf("Paragraph 1");
			cap1.addElm(p1);
			Paragraf p2 = new Paragraf("Paragraph 2");
			cap1.addElm(p2);
			Paragraf p3 = new Paragraf("Paragraph 3");
			cap1.addElm(p3);
			Paragraf p4 = new Paragraf("Paragraph 4");
			cap1.addElm(p4);
			cap1.addElm(new ImageProxy("ImageOne"));
			cap1.addElm(new Imagine("ImageTwo"));
			cap1.addElm(new Paragraf("Some text"));
			cap1.addElm(new Tabel("Table 1"));
			BookStatistics stats = new BookStatistics();
			cap1.accept(stats);
			stats.printStatistics(); 
  
		    
			Builder jsonBuilder = new JSONBuilder();
       	    jsonBuilder.Build();
            Element myBook = jsonBuilder.GetResult();
            myBook.print();
		
		
		
		Command cmd1 = new OpenCommand("book.json");
		cmd1.execute();
		Command cmd2 = new StatisticsCommand();
		cmd2.execute();
		DocumentManager.getBook().print();*/
		
		//lab
		/*
		Section cap1 = new Section("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraph 1");
		cap1.add(p1);
		Paragraf p2 = new Paragraf("Paragraph 2");
		cap1.add(p2);
		Paragraf p3 = new Paragraf("Paragraph 3");
		cap1.add(p3);
		Paragraf p4 = new Paragraf("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Imagine("ImageTwo"));
		cap1.add(new Paragraf("Some text"));
		cap1.add(new Tabel("Table 1"));
		FirstObserver firstObserver = new FirstObserver();
		SecondObserver secondObserver = new SecondObserver();
		cap1.addObserver( firstObserver);
		cap1.addObserver( secondObserver);
		p1.addObserver( firstObserver);
		p1.addObserver( secondObserver);
		p2.addObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		cap1.removeObserver( firstObserver);
		cap1.setNewValue("CHAPTER 1.1");
		*/
		
		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraf("Moto capitol"));
		cap1.add(new Paragraf("Another One"));
		cap1.add(new Paragraf("Another Two"));
		cap1.add(new Paragraf("Another Three"));
		DocumentManager.getInstance().setSection(cap1);
		System.out.println("Book Content: ");
		DocumentManager.getInstance();
		DocumentManager.getSection().print();
		
		
		new DeleteCommand().execute();
		System.out.println("\nBook Content after the first delete: ");
		DocumentManager.getInstance();
		DocumentManager.getSection().print();
		
		new DeleteCommand().execute();
		System.out.println("\nBook Content after the second delete: ");
		DocumentManager.getInstance();
		DocumentManager.getSection().print();
		
		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("\nBook Content after first undo: ");
		DocumentManager.getInstance();
		DocumentManager.getSection().print();
		undoCommand.execute();
		System.out.println("\nBook Content after second undo: ");
		DocumentManager.getInstance();
		DocumentManager.getSection().print();
	}


	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Section copy() {
		// TODO Auto-generated method stub
		return null;
	}



	
}
