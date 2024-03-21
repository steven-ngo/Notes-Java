import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * MVCTester class
 */
public class NotesTester {

	// main class
	public static void main(String[] args) {

		/*
		 * This is MVC Controller where it is responsible for responding to the user
		 * input and perform interactions on the Model objects
		 */
		Model model = new Model();
		View view = new View();

		ChangeListener listener = new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				view.setTextArea(model.toString());
			}
		};
		model.addChangeListener(listener);

		view.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.add(view.getTextField().getText().trim() + "\n");

			}
		});

	}

}
