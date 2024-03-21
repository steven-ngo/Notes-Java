
import javax.swing.event.*;
import java.util.ArrayList;

/*
 * Model class is responsible for managing the data of the application
 * 
 */
public class Model {
	
	/*
	 * ArrayList for list of strings and list of listeners
	 */
	private ArrayList<ChangeListener> listeners;
	private ArrayList<String> text;

/*
 * Constructor
 */
	public Model() {
		
		text = new ArrayList<String>();
		listeners = new ArrayList<ChangeListener>();
	}

	/*
	 * add ChangeListener into the listener ArrayList
	 * @param ChangeListener c
	 */
	public void addChangeListener(ChangeListener c) {
		listeners.add(c);
	}
	
	/*
	 *add string text into the the text ArrayList
	 *@param String text 
	 */
	public void add(String text) {

		this.text.add(text);

		//ChangeEvent changeListener = new ChangeEvent(this);
		for (ChangeListener l : listeners) 
			l.stateChanged(new ChangeEvent(this));
	}


/*
 * @Override toString
 * @return text
 */
	public String toString() {
		String textt ="";
			for (String x : text) {
			textt += x;
			}
		return textt;
	}

}
