import java.util.Observable;
import java.util.Observer;

public class FirstObserver implements Observerr{

	public void update(String oldValue, String newValue) {
		System.out.println("First Observer: Old Value:  "+oldValue+ " newValue: "+newValue);
		
	}

	

	

}
