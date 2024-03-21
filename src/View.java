
import javax.swing.*;

/*
 * View class  is responsible for Creating the view of the application
 */

public class View {
	private JTextArea t1;
	private JTextField t;
	private JButton b;

	/*
	 * Constructor View
	 */
	View() {

		JFrame f = new JFrame("Notes by Steven Ngo");

		JPanel aP = new JPanel();
		aP.setLayout(new BoxLayout(aP, BoxLayout.Y_AXIS));

		b = new JButton("add");
		t = new JTextField();
		t1 = new JTextArea(10, 10);
		t1.setEditable(false);

		JScrollPane sp = new JScrollPane(t);
		JScrollPane sp1 = new JScrollPane(t1);

		aP.add(b);
		aP.add(sp);
		aP.add(sp1);

		f.add(aP);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

	/*
	 * set the textArea equal the String x
	 * 
	 * @param String x
	 */
	public void setTextArea(String x) {
		t1.setText(x);
	}

	/*
	 * TextField getter
	 * 
	 * @return JTextField t
	 */
	public JTextField getTextField() {
		return t;
	}

	/*
	 * Button getter
	 * 
	 * @return JButton b
	 */
	public JButton getButton() {
		return b;
	}

}
