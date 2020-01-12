public class StatisticsCommand implements Command{
	  public void execute() {
		    BookStatistics stats = new BookStatistics();
		    DocumentManager.getInstance();
			DocumentManager.getBook().accept(stats);
		    stats.printStatistics();
}

}